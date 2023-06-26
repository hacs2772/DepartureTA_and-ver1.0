package com.example.capstonedesign3;


import android.Manifest;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.room.Room;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity implements LocationListener  {
    private static final int JOB_KEY = 101;
    private final int PERMISSION_REQUEST_RESULT = 100;
    private Button timescreen_move;
    private Button routescreen_move;
    private FinallincityDao finallincityDao;
    private FinalloutcityDao finalloutcityDao;
    Thread thread;
    boolean isThread = false;
    TextView tv_location;
    Button bt_my_location;
    Button thread_start, thread_stop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // JobScheduler 등록
//        initJobScheduler();
        tv_location = (TextView) findViewById(R.id.tv_location);
        bt_my_location = (Button) findViewById(R.id.bt_my_location);
        bt_my_location.setOnClickListener(onClickListener);

        requestPermissionLocation();

        timescreen_move = findViewById(R.id.timescreen_move);
        timescreen_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Timescreen.class);
                startActivity(intent); // timescreen 이동
            }
        });

        routescreen_move = findViewById(R.id.routescreen_move);
        routescreen_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Routescreen.class);
                startActivity(intent); // routescreen 이동
            }
        });
        //스레드 시작
        thread_start = (Button) findViewById(R.id.thread_start);
        thread_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isThread = true;
                thread = new Thread() {
                    public void run() {
                        while (isThread) {
                            try {
                                sleep(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            handler.sendEmptyMessage(0);
                        }
                    }
                };
                thread.start();
            }
        });

        //스레드 종료
        thread_stop = (Button) findViewById(R.id.thread_stop);
        thread_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isTread = false;

            }
        });

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.bt_my_location:
                    myLocationService();

                    break;
            }
        }
    };

    public void myLocationService() {
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        try {
//            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 0, MainActivity.this);
            //GPS를 이용하여,6시간마다갱신함, 그러나 100m이상 위치이동 될 시 에만 자동으로 업데이트
        } catch (SecurityException e) {
            e.printStackTrace();
        }


        /*try {
            Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER); //NETWORK_PROVIDER 실내에서 이걸로 해라
            if (location != null) {
                long now = System.currentTimeMillis();
                Date date = new Date(now);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd : HH-mm-ss");
                String getTime = simpleDateFormat.format(date);
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                String msg = tv_location.getText().toString() + getTime + "\nlatitude:" + latitude + "\nlongitude:" + longitude + "\n---------------------\n";
                tv_location.setText(msg);
            }
        }catch (SecurityException e){
            e.printStackTrace();
        }*/
    }

    public boolean requestPermissionLocation() {
        int sdkVersion = Build.VERSION.SDK_INT;

        if (sdkVersion >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)) {

                } else {
                    ActivityCompat.requestPermissions(this,
                            new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, PERMISSION_REQUEST_RESULT);
                }
            } else {

            }
        } else {

        }

        return true;
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            Toast.makeText(getApplicationContext(), "위치기 업데이트 되었습니다.", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    public void onLocationChanged(@NonNull Location location) {
        long now = System.currentTimeMillis();
        Date date = new Date(now);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd : HH-mm-ss");
        String getTime = simpleDateFormat.format(date);

        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        String msg = tv_location.getText().toString() + getTime + "\nlatitude:" + latitude + "\nlongitude:" + longitude + "\n---------------------\n";

        tv_location.setText(msg);
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        LocationListener.super.onStatusChanged(provider, status, extras);
    }

    @Override
    public void onProviderEnabled(@NonNull String provider) {
        LocationListener.super.onProviderEnabled(provider);
    }

    @Override
    public void onProviderDisabled(@NonNull String provider) {
        LocationListener.super.onProviderDisabled(provider);
    }


    public void createNotification(View view) {
        FinallincityDatabase finallincityDatabase = Room.databaseBuilder(getApplicationContext(), FinallincityDatabase.class, "finallincity.db")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
        finallincityDao = finallincityDatabase.finallincityDao();
        FinalloutcityDatabase database1 = Room.databaseBuilder(getApplicationContext(), FinalloutcityDatabase.class, "finalloutcity.db")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
        finalloutcityDao = database1.finalloutcityDao();

        String nowDay = "";
        switch (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
            case 1:
                nowDay = "일";
                break;
            case 2:
                nowDay = "월";
                break;
            case 3:
                nowDay = "화";
                break;
            case 4:
                nowDay = "수";
                break;
            case 5:
                nowDay = "목";
                break;
            case 6:
                nowDay = "금";
                break;
            case 7:
                nowDay = "토";
                break;
        }
        String altime = finallincityDao.getsc(nowDay);

        NotificationManager notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        //Notification 객체를 생성해주는 건축가객체 생성(AlertDialog 와 비슷)
        NotificationCompat.Builder builder= null;

        //Oreo 버전(API26 버전)이상에서는 알림시에 NotificationChannel 이라는 개념이 필수 구성요소가 됨.
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

            String channelID="channel_01"; //알림채널 식별자
            String channelName="MyChannel01"; //알림채널의 이름(별명)

            //알림채널 객체 만들기
            NotificationChannel channel= new NotificationChannel(channelID,channelName,NotificationManager.IMPORTANCE_DEFAULT);

            //알림매니저에게 채널 객체의 생성을 요청
            notificationManager.createNotificationChannel(channel);

            //알림건축가 객체 생성
            builder=new NotificationCompat.Builder(this, channelID);


        }else{
            //알림 건축가 객체 생성
            builder= new NotificationCompat.Builder(this, (Notification) null);
        }

        //건축가에게 원하는 알림의 설정작업
        builder.setSmallIcon(android.R.drawable.ic_menu_view);

        //상태바를 드래그하여 아래로 내리면 보이는
        //알림창(확장 상태바)의 설정
        builder.setContentTitle("출발시간 알림이");//알림창 제목
        builder.setContentText("출발해야될 시간은 " + altime + " 입니다.");//알림창 내용
        //알림창의 큰 이미지
        Bitmap bm= BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
        builder.setLargeIcon(bm);//매개변수가 Bitmap을 줘야한다.

        //건축가에게 알림 객체 생성하도록
        Notification notification=builder.build();

        //알림매니저에게 알림(Notify) 요청
        notificationManager.notify(1, notification);

        //알림 요청시에 사용한 번호를 알림제거 할 수 있음.
        //notificationManager.cancel(1);
    }

    private void show() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"default");

        builder.setSmallIcon(android.R.drawable.ic_menu_view);
        builder.setContentTitle("알림 제목");
        builder.setContentText("알림 세부 텍스트");

        Intent intent = new Intent(this,MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_CANCEL_CURRENT);

        builder.setContentIntent(pendingIntent);

        Bitmap largeIcon = BitmapFactory.decodeResource(getResources(),
                R.mipmap.ic_launcher);
        builder.setLargeIcon(largeIcon);

        builder.setColor(Color.RED);

        Uri ringtoneUri = RingtoneManager.getActualDefaultRingtoneUri(this,
                RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(ringtoneUri);

        long[] vibrate = {0, 100, 200, 300};
        builder.setVibrate(vibrate);
        builder.setAutoCancel(true);

        //중요한 기본채널 만들기 oncreate에서 작성해도 무방함
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            manager.createNotificationChannel(new NotificationChannel("defult", "기본 채널",
                    NotificationManager.IMPORTANCE_DEFAULT));
        }
        manager.notify(1,builder.build());

    }

    public void removeNotification(View view) {
        hide();

    }

    //id1번을 제거하겠다.
    private void hide() {
        NotificationManagerCompat.from(this).cancel(1);
    }


    private void initJobScheduler() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ComponentName componentName = new ComponentName(this, JobService.class);
//            PersistableBundle bundle = new PersistableBundle();
//            bundle.putInt("number", 10);
            JobInfo.Builder builder = new JobInfo.Builder(JOB_KEY, componentName);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                // 버전마다 기간등록하는방법이 다르다해서 이렇게 작성했습니다.
                // 정확한건 더 찾아봐야 합니다.
                // 첫번째칸  간격 설정(최소시간 15분)
                // 두번째칸 이 작업에 대한 밀리초 플렉스. Flex는 기간의 최소 또는 5% 중 더 높은 값으로 고정됩니다
                builder.setPeriodic(15 * 60 * 1000, 20 * 60 * 1000);
            } else {
                builder.setPeriodic(15 * 60 * 1000);
            }
            JobScheduler scheduler = (JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);
            scheduler.schedule(builder.build());
        }
    }
    private void alinitJobScheduler() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ComponentName componentName = new ComponentName(this, TimeService.class);
//            PersistableBundle bundle = new PersistableBundle();
//            bundle.putInt("number", 10);
            JobInfo.Builder builder = new JobInfo.Builder(JOB_KEY, componentName);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                // 버전마다 기간등록하는방법이 다르다해서 이렇게 작성했습니다.
                // 정확한건 더 찾아봐야 합니다.
                // 첫번째칸  간격 설정(최소시간 15분)
                // 두번째칸 이 작업에 대한 밀리초 플렉스. Flex는 기간의 최소 또는 5% 중 더 높은 값으로 고정됩니다
                builder.setPeriodic(360 * 60 * 1000, 20 * 60 * 1000);
            } else {
                builder.setPeriodic(15 * 60 * 1000);
            }
            JobScheduler scheduler = (JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);
            scheduler.schedule(builder.build());
        }
    }
}