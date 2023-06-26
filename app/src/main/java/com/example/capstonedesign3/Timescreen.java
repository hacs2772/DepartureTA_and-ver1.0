package com.example.capstonedesign3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Timescreen extends AppCompatActivity {
private DayTimeDao dayTimeDao;
    TextView cla;

    TextView mo0;
    TextView mo1;
    TextView mo2;
    TextView mo3;
    TextView mo4;
    TextView mo5;
    TextView mo6;
    TextView mo7;
    TextView mo8;

    TextView tu0;
    TextView tu1;
    TextView tu2;
    TextView tu3;
    TextView tu4;
    TextView tu5;
    TextView tu6;
    TextView tu7;
    TextView tu8;

    TextView we0;
    TextView we1;
    TextView we2;
    TextView we3;
    TextView we4;
    TextView we5;
    TextView we6;
    TextView we7;
    TextView we8;

    TextView th0;
    TextView th1;
    TextView th2;
    TextView th3;
    TextView th4;
    TextView th5;
    TextView th6;
    TextView th7;
    TextView th8;

    TextView fr0;
    TextView fr1;
    TextView fr2;
    TextView fr3;
    TextView fr4;
    TextView fr5;
    TextView fr6;
    TextView fr7;
    TextView fr8;

    TextView sa0;
    TextView sa1;
    TextView sa2;
    TextView sa3;
    TextView sa4;
    TextView sa5;
    TextView sa6;
    TextView sa7;
    TextView sa8;


    TextView buttonEvent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timescreen);
        cla = (TextView) findViewById(R.id.clearalll);

        // 월요일
        mo0 = (TextView) findViewById(R.id.monday0);
        mo1 = (TextView) findViewById(R.id.monday1);
        mo2 = (TextView) findViewById(R.id.monday2);
        mo3 = (TextView) findViewById(R.id.monday3);
        mo4 = (TextView) findViewById(R.id.monday4);
        mo5 = (TextView) findViewById(R.id.monday5);
        mo6 = (TextView) findViewById(R.id.monday6);
        mo7 = (TextView) findViewById(R.id.monday7);
        mo8 = (TextView) findViewById(R.id.monday8);
        // 화요일
        tu0 = (TextView) findViewById(R.id.tuesday0);
        tu1 = (TextView) findViewById(R.id.tuesday1);
        tu2 = (TextView) findViewById(R.id.tuesday2);
        tu3 = (TextView) findViewById(R.id.tuesday3);
        tu4 = (TextView) findViewById(R.id.tuesday4);
        tu5 = (TextView) findViewById(R.id.tuesday5);
        tu6 = (TextView) findViewById(R.id.tuesday6);
        tu7 = (TextView) findViewById(R.id.tuesday7);
        tu8 = (TextView) findViewById(R.id.tuesday8);
        // 수요일
        we0 = (TextView) findViewById(R.id.wednessday0);
        we1 = (TextView) findViewById(R.id.wednessday1);
        we2 = (TextView) findViewById(R.id.wednessday2);
        we3 = (TextView) findViewById(R.id.wednessday3);
        we4 = (TextView) findViewById(R.id.wednessday4);
        we5 = (TextView) findViewById(R.id.wednessday5);
        we6 = (TextView) findViewById(R.id.wednessday6);
        we7 = (TextView) findViewById(R.id.wednessday7);
        we8 = (TextView) findViewById(R.id.wednessday8);
        // 목요일
        th0 = (TextView) findViewById(R.id.thursday0);
        th1 = (TextView) findViewById(R.id.thursday1);
        th2 = (TextView) findViewById(R.id.thursday2);
        th3 = (TextView) findViewById(R.id.thursday3);
        th4 = (TextView) findViewById(R.id.thursday4);
        th5 = (TextView) findViewById(R.id.thursday5);
        th6 = (TextView) findViewById(R.id.thursday6);
        th7 = (TextView) findViewById(R.id.thursday7);
        th8 = (TextView) findViewById(R.id.thursday8);
        //금요일
        fr0 = (TextView) findViewById(R.id.friday0);
        fr1 = (TextView) findViewById(R.id.friday1);
        fr2 = (TextView) findViewById(R.id.friday2);
        fr3 = (TextView) findViewById(R.id.friday3);
        fr4 = (TextView) findViewById(R.id.friday4);
        fr5 = (TextView) findViewById(R.id.friday5);
        fr6 = (TextView) findViewById(R.id.friday6);
        fr7 = (TextView) findViewById(R.id.friday7);
        fr8 = (TextView) findViewById(R.id.friday8);
        // 토요일
        sa0= (TextView) findViewById(R.id.saturday0);
        sa1= (TextView) findViewById(R.id.saturday1);
        sa2= (TextView) findViewById(R.id.saturday2);
        sa3= (TextView) findViewById(R.id.saturday3);
        sa4= (TextView) findViewById(R.id.saturday4);
        sa5= (TextView) findViewById(R.id.saturday5);
        sa6= (TextView) findViewById(R.id.saturday6);
        sa7= (TextView) findViewById(R.id.saturday7);
        sa8= (TextView) findViewById(R.id.saturday8);
        DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(),DayTimeDatabase.class,"daytime.db")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
        dayTimeDao= db.dayTimeDao();
        int mot = dayTimeDao.gettime("월");
        int tut = dayTimeDao.gettime("화");
        int wet = dayTimeDao.gettime("수");
        int tht = dayTimeDao.gettime("목");
        int frt = dayTimeDao.gettime("금");
        int sat = dayTimeDao.gettime("토");

        switch (mot){
            case 600:
                mo1.setSelected(true);
                break;
            case 660:
                mo2.setSelected(true);
                break;
            case 720:
                mo3.setSelected(true);
                break;
            case 780:
                mo4.setSelected(true);
                break;
            case 840:
                mo5.setSelected(true);
                break;
            case 900:
                mo6.setSelected(true);
                break;
            case 960:
                mo7.setSelected(true);
                break;
            case 1020:
                mo8.setSelected(true);
                break;
            default:
                mo0.setSelected(true);
        }

        switch (tut){
            case 600:
                tu1.setSelected(true);
                break;
            case 660:
                tu2.setSelected(true);
                break;
            case 720:
                tu3.setSelected(true);
                break;
            case 780:
                tu4.setSelected(true);
                break;
            case 840:
                tu5.setSelected(true);
                break;
            case 900:
                tu6.setSelected(true);
                break;
            case 960:
                tu7.setSelected(true);
                break;
            case 1020:
                tu8.setSelected(true);
                break;
            default:
                tu0.setSelected(true);
        }

        switch (wet){
            case 600:
                we1.setSelected(true);
                break;
            case 660:
                we2.setSelected(true);
                break;
            case 720:
                we3.setSelected(true);
                break;
            case 780:
                we4.setSelected(true);
                break;
            case 840:
                we5.setSelected(true);
                break;
            case 900:
                we6.setSelected(true);
                break;
            case 960:
                we7.setSelected(true);
                break;
            case 1020:
                we8.setSelected(true);
                break;
            default:
                we0.setSelected(true);
        }

        switch (tht){
            case 600:
                th1.setSelected(true);
                break;
            case 660:
                th2.setSelected(true);
                break;
            case 720:
                th3.setSelected(true);
                break;
            case 780:
                th4.setSelected(true);
                break;
            case 840:
                th5.setSelected(true);
                break;
            case 900:
                th6.setSelected(true);
                break;
            case 960:
                th7.setSelected(true);
                break;
            case 1020:
                th8.setSelected(true);
                break;
            default:
                th0.setSelected(true);
        }

        switch (frt){
            case 600:
                fr1.setSelected(true);
                break;
            case 660:
                fr2.setSelected(true);
                break;
            case 720:
                fr3.setSelected(true);
                break;
            case 780:
                fr4.setSelected(true);
                break;
            case 840:
                fr5.setSelected(true);
                break;
            case 900:
                fr6.setSelected(true);
                break;
            case 960:
                fr7.setSelected(true);
                break;
            case 1020:
                fr8.setSelected(true);
                break;
            default:
                fr0.setSelected(true);
        }

        switch (sat){
            case 600:
                sa1.setSelected(true);
                break;
            case 660:
                sa2.setSelected(true);
                break;
            case 720:
                sa3.setSelected(true);
                break;
            case 780:
                sa4.setSelected(true);
                break;
            case 840:
                sa5.setSelected(true);
                break;
            case 900:
                sa6.setSelected(true);
                break;
            case 960:
                sa7.setSelected(true);
                break;
            case 1020:
                sa8.setSelected(true);
                break;
            default:
                sa0.setSelected(true);
        }
        cla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("데이터 초기화")
                        .setMessage("저장된 데이터를 모두 초기화 하시겠습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "초기화를 완료하였습니다", Toast.LENGTH_SHORT).show();

                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();
                                dayTimeDao.del();

                                Intent intent = new Intent(Timescreen.this, MainActivity.class);
                                startActivity(intent); // 메인 화면으로 이동
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 월요일 1교시 (9:00) 클릭 이벤트
        mo0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("1교시 (9:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();

                                mo0.setSelected(true);
                                mo1.setSelected(false);
                                mo2.setSelected(false);
                                mo3.setSelected(false);
                                mo4.setSelected(false);
                                mo5.setSelected(false);
                                mo6.setSelected(false);
                                mo7.setSelected(false);
                                mo8.setSelected(false);


                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("월");
                                if (moo == null){
                                    dayTime.setDay("월");
                                    dayTime.setTime(540);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upmon(540);
                                }

                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 월요일 2교시 (10:00) 클릭 이벤트
        mo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("2교시 (10:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                mo0.setSelected(false);
                                mo1.setSelected(true);
                                mo2.setSelected(false);
                                mo3.setSelected(false);
                                mo4.setSelected(false);
                                mo5.setSelected(false);
                                mo6.setSelected(false);
                                mo7.setSelected(false);
                                mo8.setSelected(false);

                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("월");
                                if (moo == null){
                                    dayTime.setDay("월");
                                    dayTime.setTime(600);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upmon(600);
                                }

                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 월요일 3교시 (11:00) 클릭 이벤트
        mo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("3교시 (11:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                mo0.setSelected(false);
                                mo1.setSelected(false);
                                mo2.setSelected(true);
                                mo3.setSelected(false);
                                mo4.setSelected(false);
                                mo5.setSelected(false);
                                mo6.setSelected(false);
                                mo7.setSelected(false);
                                mo8.setSelected(false);

                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("월");
                                if (moo == null){
                                    dayTime.setDay("월");
                                    dayTime.setTime(660);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upmon(660);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 월요일 4교시 (12:00) 클릭 이벤트
        mo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("4교시 (12:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                mo0.setSelected(false);
                                mo1.setSelected(false);
                                mo2.setSelected(false);
                                mo3.setSelected(true);
                                mo4.setSelected(false);
                                mo5.setSelected(false);
                                mo6.setSelected(false);
                                mo7.setSelected(false);
                                mo8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("월");
                                if (moo == null){
                                    dayTime.setDay("월");
                                    dayTime.setTime(720);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upmon(720);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 월요일 5교시 (13:00) 클릭 이벤트
        mo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("5교시 (13:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                mo0.setSelected(false);
                                mo1.setSelected(false);
                                mo2.setSelected(false);
                                mo3.setSelected(false);
                                mo4.setSelected(true);
                                mo5.setSelected(false);
                                mo6.setSelected(false);
                                mo7.setSelected(false);
                                mo8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("월");
                                if (moo == null){
                                    dayTime.setDay("월");
                                    dayTime.setTime(780);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upmon(780);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 월요일 6교시 (14:00) 클릭 이벤트
        mo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("6교시 (14:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                mo0.setSelected(false);
                                mo1.setSelected(false);
                                mo2.setSelected(false);
                                mo3.setSelected(false);
                                mo4.setSelected(false);
                                mo5.setSelected(true);
                                mo6.setSelected(false);
                                mo7.setSelected(false);
                                mo8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("월");
                                if (moo == null){
                                    dayTime.setDay("월");
                                    dayTime.setTime(840);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upmon(840);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 월요일 7교시 (15:00) 클릭 이벤트
        mo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("7교시 (15:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                mo0.setSelected(false);
                                mo1.setSelected(false);
                                mo2.setSelected(false);
                                mo3.setSelected(false);
                                mo4.setSelected(false);
                                mo5.setSelected(false);
                                mo6.setSelected(true);
                                mo7.setSelected(false);
                                mo8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("월");
                                if (moo == null){
                                    dayTime.setDay("월");
                                    dayTime.setTime(900);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upmon(900);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 월요일 8교시 (16:00) 클릭 이벤트
        mo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("8교시 (16:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                mo0.setSelected(false);
                                mo1.setSelected(false);
                                mo2.setSelected(false);
                                mo3.setSelected(false);
                                mo4.setSelected(false);
                                mo5.setSelected(false);
                                mo6.setSelected(false);
                                mo7.setSelected(true);
                                mo8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("월");
                                if (moo == null){
                                    dayTime.setDay("월");
                                    dayTime.setTime(960);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upmon(960);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 월요일 9교시 (17:00) 클릭 이벤트
        mo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("9교시 (17:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                mo0.setSelected(false);
                                mo1.setSelected(false);
                                mo2.setSelected(false);
                                mo3.setSelected(false);
                                mo4.setSelected(false);
                                mo5.setSelected(false);
                                mo6.setSelected(false);
                                mo7.setSelected(false);
                                mo8.setSelected(true);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("월");
                                if (moo == null){
                                    dayTime.setDay("월");
                                    dayTime.setTime(1020);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upmon(1020);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });



        //
        //
        // 화요일 1교시 (9:00) 클릭 이벤트
        tu0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("1교시 (9:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                tu0.setSelected(true);
                                tu1.setSelected(false);
                                tu2.setSelected(false);
                                tu3.setSelected(false);
                                tu4.setSelected(false);
                                tu5.setSelected(false);
                                tu6.setSelected(false);
                                tu7.setSelected(false);
                                tu8.setSelected(false);

                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("화");
                                if (moo == null){
                                    dayTime.setDay("화");
                                    dayTime.setTime(540);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.uptu(540);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 화요일 2교시 (10:00) 클릭 이벤트
        tu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("2교시 (10:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                tu0.setSelected(false);
                                tu1.setSelected(true);
                                tu2.setSelected(false);
                                tu3.setSelected(false);
                                tu4.setSelected(false);
                                tu5.setSelected(false);
                                tu6.setSelected(false);
                                tu7.setSelected(false);
                                tu8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("화");
                                if (moo == null){
                                    dayTime.setDay("화");
                                    dayTime.setTime(600);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.uptu(600);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 화요일 3교시 (11:00) 클릭 이벤트
        tu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("3교시 (11:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                tu0.setSelected(false);
                                tu1.setSelected(false);
                                tu2.setSelected(true);
                                tu3.setSelected(false);
                                tu4.setSelected(false);
                                tu5.setSelected(false);
                                tu6.setSelected(false);
                                tu7.setSelected(false);
                                tu8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("화");
                                if (moo == null){
                                    dayTime.setDay("화");
                                    dayTime.setTime(660);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.uptu(660);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 화요일 4교시 (12:00) 클릭 이벤트
        tu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("4교시 (12:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                tu0.setSelected(false);
                                tu1.setSelected(false);
                                tu2.setSelected(false);
                                tu3.setSelected(true);
                                tu4.setSelected(false);
                                tu5.setSelected(false);
                                tu6.setSelected(false);
                                tu7.setSelected(false);
                                tu8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("화");
                                if (moo == null){
                                    dayTime.setDay("화");
                                    dayTime.setTime(720);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.uptu(720);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 화요일 5교시 (13:00) 클릭 이벤트
        tu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("5교시 (13:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                tu0.setSelected(false);
                                tu1.setSelected(false);
                                tu2.setSelected(false);
                                tu3.setSelected(false);
                                tu4.setSelected(true);
                                tu5.setSelected(false);
                                tu6.setSelected(false);
                                tu7.setSelected(false);
                                tu8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("화");
                                if (moo == null){
                                    dayTime.setDay("화");
                                    dayTime.setTime(780);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.uptu(780);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 화요일 6교시 (14:00) 클릭 이벤트
        tu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("6교시 (14:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                tu0.setSelected(false);
                                tu1.setSelected(false);
                                tu2.setSelected(false);
                                tu3.setSelected(false);
                                tu4.setSelected(false);
                                tu5.setSelected(true);
                                tu6.setSelected(false);
                                tu7.setSelected(false);
                                tu8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("화");
                                if (moo == null){
                                    dayTime.setDay("화");
                                    dayTime.setTime(840);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.uptu(840);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 화요일 7교시 (15:00) 클릭 이벤트
        tu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("7교시 (15:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                tu0.setSelected(false);
                                tu1.setSelected(false);
                                tu2.setSelected(false);
                                tu3.setSelected(false);
                                tu4.setSelected(false);
                                tu5.setSelected(false);
                                tu6.setSelected(true);
                                tu7.setSelected(false);
                                tu8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("화");
                                if (moo == null){
                                    dayTime.setDay("화");
                                    dayTime.setTime(900);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.uptu(900);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 화요일 8교시 (16:00) 클릭 이벤트
        tu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("8교시 (16:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                tu0.setSelected(false);
                                tu1.setSelected(false);
                                tu2.setSelected(false);
                                tu3.setSelected(false);
                                tu4.setSelected(false);
                                tu5.setSelected(false);
                                tu6.setSelected(false);
                                tu7.setSelected(true);
                                tu8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("화");
                                if (moo == null){
                                    dayTime.setDay("화");
                                    dayTime.setTime(960);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.uptu(960);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        // 화요일 9교시 (17:00) 클릭 이벤트
        tu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("9교시 (17:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                tu0.setSelected(false);
                                tu1.setSelected(false);
                                tu2.setSelected(false);
                                tu3.setSelected(false);
                                tu4.setSelected(false);
                                tu5.setSelected(false);
                                tu6.setSelected(false);
                                tu7.setSelected(false);
                                tu8.setSelected(true);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("화");
                                if (moo == null){
                                    dayTime.setDay("화");
                                    dayTime.setTime(1020);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.uptu(1020);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });


        //
        //
        // 수요일 1교시 (9:00) 클릭 이벤트
        we0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("1교시 (9:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                we0.setSelected(true);
                                we1.setSelected(false);
                                we2.setSelected(false);
                                we3.setSelected(false);
                                we4.setSelected(false);
                                we5.setSelected(false);
                                we6.setSelected(false);
                                we7.setSelected(false);
                                we8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("수");
                                if (moo == null){
                                    dayTime.setDay("수");
                                    dayTime.setTime(540);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upwe(540);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        we1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("2교시 (10:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                we0.setSelected(false);
                                we1.setSelected(true);
                                we2.setSelected(false);
                                we3.setSelected(false);
                                we4.setSelected(false);
                                we5.setSelected(false);
                                we6.setSelected(false);
                                we7.setSelected(false);
                                we8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("수");
                                if (moo == null){
                                    dayTime.setDay("수");
                                    dayTime.setTime(600);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upwe(600);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        we2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("3교시 (11:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                we0.setSelected(false);
                                we1.setSelected(false);
                                we2.setSelected(true);
                                we3.setSelected(false);
                                we4.setSelected(false);
                                we5.setSelected(false);
                                we6.setSelected(false);
                                we7.setSelected(false);
                                we8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("수");
                                if (moo == null){
                                    dayTime.setDay("수");
                                    dayTime.setTime(660);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upwe(660);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        we3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("4교시 (12:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                we0.setSelected(false);
                                we1.setSelected(false);
                                we2.setSelected(false);
                                we3.setSelected(true);
                                we4.setSelected(false);
                                we5.setSelected(false);
                                we6.setSelected(false);
                                we7.setSelected(false);
                                we8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("수");
                                if (moo == null){
                                    dayTime.setDay("수");
                                    dayTime.setTime(720);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upwe(720);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        we4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("5교시 (13:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                we0.setSelected(false);
                                we1.setSelected(false);
                                we2.setSelected(false);
                                we3.setSelected(false);
                                we4.setSelected(true);
                                we5.setSelected(false);
                                we6.setSelected(false);
                                we7.setSelected(false);
                                we8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("수");
                                if (moo == null){
                                    dayTime.setDay("수");
                                    dayTime.setTime(780);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upwe(780);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        we5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("6교시 (14:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                we0.setSelected(false);
                                we1.setSelected(false);
                                we2.setSelected(false);
                                we3.setSelected(false);
                                we4.setSelected(false);
                                we5.setSelected(true);
                                we6.setSelected(false);
                                we7.setSelected(false);
                                we8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("수");
                                if (moo == null){
                                    dayTime.setDay("수");
                                    dayTime.setTime(840);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upwe(840);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        we6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("7교시 (15:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                we0.setSelected(false);
                                we1.setSelected(false);
                                we2.setSelected(false);
                                we3.setSelected(false);
                                we4.setSelected(false);
                                we5.setSelected(false);
                                we6.setSelected(true);
                                we7.setSelected(false);
                                we8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("수");
                                if (moo == null){
                                    dayTime.setDay("수");
                                    dayTime.setTime(900);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upwe(900);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        we7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("8교시 (16:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                we0.setSelected(false);
                                we1.setSelected(false);
                                we2.setSelected(false);
                                we3.setSelected(false);
                                we4.setSelected(false);
                                we5.setSelected(false);
                                we6.setSelected(false);
                                we7.setSelected(true);
                                we8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("수");
                                if (moo == null){
                                    dayTime.setDay("수");
                                    dayTime.setTime(960);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upwe(960);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        we8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("9교시 (17:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                we0.setSelected(false);
                                we1.setSelected(false);
                                we2.setSelected(false);
                                we3.setSelected(false);
                                we4.setSelected(false);
                                we5.setSelected(false);
                                we6.setSelected(false);
                                we7.setSelected(false);
                                we8.setSelected(true);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("수");
                                if (moo == null){
                                    dayTime.setDay("수");
                                    dayTime.setTime(1020);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upwe(1020);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        //
        //
        // 목요일 1교시 (9:00) 클릭 이벤트
        th0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("1교시 (9:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                th0.setSelected(true);
                                th1.setSelected(false);
                                th2.setSelected(false);
                                th3.setSelected(false);
                                th4.setSelected(false);
                                th5.setSelected(false);
                                th6.setSelected(false);
                                th7.setSelected(false);
                                th8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("목");
                                if (moo == null){
                                    dayTime.setDay("목");
                                    dayTime.setTime(540);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upth(540);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        th1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("2교시 (10:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                th0.setSelected(false);
                                th1.setSelected(true);
                                th2.setSelected(false);
                                th3.setSelected(false);
                                th4.setSelected(false);
                                th5.setSelected(false);
                                th6.setSelected(false);
                                th7.setSelected(false);
                                th8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("목");
                                if (moo == null){
                                    dayTime.setDay("목");
                                    dayTime.setTime(600);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upth(600);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        th2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("3교시 (11:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                th0.setSelected(false);
                                th1.setSelected(false);
                                th2.setSelected(true);
                                th3.setSelected(false);
                                th4.setSelected(false);
                                th5.setSelected(false);
                                th6.setSelected(false);
                                th7.setSelected(false);
                                th8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("목");
                                if (moo == null){
                                    dayTime.setDay("목");
                                    dayTime.setTime(660);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upth(660);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        th3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("4교시 (12:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                th0.setSelected(false);
                                th1.setSelected(false);
                                th2.setSelected(false);
                                th3.setSelected(true);
                                th4.setSelected(false);
                                th5.setSelected(false);
                                th6.setSelected(false);
                                th7.setSelected(false);
                                th8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("목");
                                if (moo == null){
                                    dayTime.setDay("목");
                                    dayTime.setTime(720);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upth(720);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        th4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("5교시 (13:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                th0.setSelected(false);
                                th1.setSelected(false);
                                th2.setSelected(false);
                                th3.setSelected(false);
                                th4.setSelected(true);
                                th5.setSelected(false);
                                th6.setSelected(false);
                                th7.setSelected(false);
                                th8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("목");
                                if (moo == null){
                                    dayTime.setDay("목");
                                    dayTime.setTime(780);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upth(780);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        th5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("6교시 (14:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                th0.setSelected(false);
                                th1.setSelected(false);
                                th2.setSelected(false);
                                th3.setSelected(false);
                                th4.setSelected(false);
                                th5.setSelected(true);
                                th6.setSelected(false);
                                th7.setSelected(false);
                                th8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("목");
                                if (moo == null){
                                    dayTime.setDay("목");
                                    dayTime.setTime(840);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upth(840);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        th6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("7교시 (15:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                th0.setSelected(false);
                                th1.setSelected(false);
                                th2.setSelected(false);
                                th3.setSelected(false);
                                th4.setSelected(false);
                                th5.setSelected(false);
                                th6.setSelected(true);
                                th7.setSelected(false);
                                th8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("목");
                                if (moo == null){
                                    dayTime.setDay("목");
                                    dayTime.setTime(900);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upth(900);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        th7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("8교시 (16:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                th0.setSelected(false);
                                th1.setSelected(false);
                                th2.setSelected(false);
                                th3.setSelected(false);
                                th4.setSelected(false);
                                th5.setSelected(false);
                                th6.setSelected(false);
                                th7.setSelected(true);
                                th8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("목");
                                if (moo == null){
                                    dayTime.setDay("목");
                                    dayTime.setTime(960);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upth(960);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        th8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("9교시 (17:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                th0.setSelected(false);
                                th1.setSelected(false);
                                th2.setSelected(false);
                                th3.setSelected(false);
                                th4.setSelected(false);
                                th5.setSelected(false);
                                th6.setSelected(false);
                                th7.setSelected(false);
                                th8.setSelected(true);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("목");
                                if (moo == null){
                                    dayTime.setDay("목");
                                    dayTime.setTime(1020);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upth(1020);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        //
        //
        // 금요일 1교시 (9:00) 클릭 이벤트
        fr0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("1교시 (9:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                fr0.setSelected(true);
                                fr1.setSelected(false);
                                fr2.setSelected(false);
                                fr3.setSelected(false);
                                fr4.setSelected(false);
                                fr5.setSelected(false);
                                fr6.setSelected(false);
                                fr7.setSelected(false);
                                fr8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("금");
                                if (moo == null){
                                    dayTime.setDay("금");
                                    dayTime.setTime(540);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upfr(540);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        fr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("2교시 (10:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                fr0.setSelected(false);
                                fr1.setSelected(true);
                                fr2.setSelected(false);
                                fr3.setSelected(false);
                                fr4.setSelected(false);
                                fr5.setSelected(false);
                                fr6.setSelected(false);
                                fr7.setSelected(false);
                                fr8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("금");
                                if (moo == null){
                                    dayTime.setDay("금");
                                    dayTime.setTime(600);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upfr(600);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        fr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("3교시 (11:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                fr0.setSelected(false);
                                fr1.setSelected(false);
                                fr2.setSelected(true);
                                fr3.setSelected(false);
                                fr4.setSelected(false);
                                fr5.setSelected(false);
                                fr6.setSelected(false);
                                fr7.setSelected(false);
                                fr8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("금");
                                if (moo == null){
                                    dayTime.setDay("금");
                                    dayTime.setTime(660);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upfr(660);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        fr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("4교시 (12:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                fr0.setSelected(false);
                                fr1.setSelected(false);
                                fr2.setSelected(false);
                                fr3.setSelected(true);
                                fr4.setSelected(false);
                                fr5.setSelected(false);
                                fr6.setSelected(false);
                                fr7.setSelected(false);
                                fr8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("금");
                                if (moo == null){
                                    dayTime.setDay("금");
                                    dayTime.setTime(720);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upfr(720);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        fr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("5교시 (13:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                fr0.setSelected(false);
                                fr1.setSelected(false);
                                fr2.setSelected(false);
                                fr3.setSelected(false);
                                fr4.setSelected(true);
                                fr5.setSelected(false);
                                fr6.setSelected(false);
                                fr7.setSelected(false);
                                fr8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("금");
                                if (moo == null){
                                    dayTime.setDay("금");
                                    dayTime.setTime(780);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upfr(780);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        fr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("6교시 (14:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                fr0.setSelected(false);
                                fr1.setSelected(false);
                                fr2.setSelected(false);
                                fr3.setSelected(false);
                                fr4.setSelected(false);
                                fr5.setSelected(true);
                                fr6.setSelected(false);
                                fr7.setSelected(false);
                                fr8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("금");
                                if (moo == null){
                                    dayTime.setDay("금");
                                    dayTime.setTime(840);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upfr(840);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        fr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("7교시 (15:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                fr0.setSelected(false);
                                fr1.setSelected(false);
                                fr2.setSelected(false);
                                fr3.setSelected(false);
                                fr4.setSelected(false);
                                fr5.setSelected(false);
                                fr6.setSelected(true);
                                fr7.setSelected(false);
                                fr8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("금");
                                if (moo == null){
                                    dayTime.setDay("금");
                                    dayTime.setTime(900);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upfr(900);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        fr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("8교시 (16:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                fr0.setSelected(false);
                                fr1.setSelected(false);
                                fr2.setSelected(false);
                                fr3.setSelected(false);
                                fr4.setSelected(false);
                                fr5.setSelected(false);
                                fr6.setSelected(false);
                                fr7.setSelected(true);
                                fr8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("금");
                                if (moo == null){
                                    dayTime.setDay("금");
                                    dayTime.setTime(960);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upfr(960);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        fr8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("9교시 (17:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                fr0.setSelected(false);
                                fr1.setSelected(false);
                                fr2.setSelected(false);
                                fr3.setSelected(false);
                                fr4.setSelected(false);
                                fr5.setSelected(false);
                                fr6.setSelected(false);
                                fr7.setSelected(false);
                                fr8.setSelected(true);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("금");
                                if (moo == null){
                                    dayTime.setDay("금");
                                    dayTime.setTime(1020);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upfr(1020);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });


        //
        //
        // 토요일 1교시 (9:00) 클릭 이벤트
        sa0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("1교시 (9:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                sa0.setSelected(true);
                                sa1.setSelected(false);
                                sa2.setSelected(false);
                                sa3.setSelected(false);
                                sa4.setSelected(false);
                                sa5.setSelected(false);
                                sa6.setSelected(false);
                                sa7.setSelected(false);
                                sa8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("토");
                                if (moo == null){
                                    dayTime.setDay("토");
                                    dayTime.setTime(540);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upse(540);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        sa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("2교시 (10:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                sa0.setSelected(false);
                                sa1.setSelected(true);
                                sa2.setSelected(false);
                                sa3.setSelected(false);
                                sa4.setSelected(false);
                                sa5.setSelected(false);
                                sa6.setSelected(false);
                                sa7.setSelected(false);
                                sa8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("토");
                                if (moo == null){
                                    dayTime.setDay("토");
                                    dayTime.setTime(600);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upse(600);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        sa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("3교시 (11:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                sa0.setSelected(false);
                                sa1.setSelected(false);
                                sa2.setSelected(true);
                                sa3.setSelected(false);
                                sa4.setSelected(false);
                                sa5.setSelected(false);
                                sa6.setSelected(false);
                                sa7.setSelected(false);
                                sa8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("토");
                                if (moo == null){
                                    dayTime.setDay("토");
                                    dayTime.setTime(660);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upse(660);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        sa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("4교시 (12:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                sa0.setSelected(false);
                                sa1.setSelected(false);
                                sa2.setSelected(false);
                                sa3.setSelected(true);
                                sa4.setSelected(false);
                                sa5.setSelected(false);
                                sa6.setSelected(false);
                                sa7.setSelected(false);
                                sa8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("토");
                                if (moo == null){
                                    dayTime.setDay("토");
                                    dayTime.setTime(720);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upse(720);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        sa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("5교시 (13:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                sa0.setSelected(false);
                                sa1.setSelected(false);
                                sa2.setSelected(false);
                                sa3.setSelected(false);
                                sa4.setSelected(true);
                                sa5.setSelected(false);
                                sa6.setSelected(false);
                                sa7.setSelected(false);
                                sa8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("토");
                                if (moo == null){
                                    dayTime.setDay("토");
                                    dayTime.setTime(780);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upse(780);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        sa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("6교시 (14:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                sa0.setSelected(false);
                                sa1.setSelected(false);
                                sa2.setSelected(false);
                                sa3.setSelected(false);
                                sa4.setSelected(false);
                                sa5.setSelected(true);
                                sa6.setSelected(false);
                                sa7.setSelected(false);
                                sa8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("토");
                                if (moo == null){
                                    dayTime.setDay("토");
                                    dayTime.setTime(840);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upse(840);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        sa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("7교시 (15:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                sa0.setSelected(false);
                                sa1.setSelected(false);
                                sa2.setSelected(false);
                                sa3.setSelected(false);
                                sa4.setSelected(false);
                                sa5.setSelected(false);
                                sa6.setSelected(true);
                                sa7.setSelected(false);
                                sa8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("토");
                                if (moo == null){
                                    dayTime.setDay("토");
                                    dayTime.setTime(900);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upse(900);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        sa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("8교시 (16:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                sa0.setSelected(false);
                                sa1.setSelected(false);
                                sa2.setSelected(false);
                                sa3.setSelected(false);
                                sa4.setSelected(false);
                                sa5.setSelected(false);
                                sa6.setSelected(false);
                                sa7.setSelected(true);
                                sa8.setSelected(false);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("토");
                                if (moo == null){
                                    dayTime.setDay("토");
                                    dayTime.setTime(960);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upse(960);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });

        sa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(Timescreen.this)
                        .setTitle("알람 저장")
                        .setMessage("9교시 (17:00)가 첫 수업이 맞습니까?")
                        .setIcon(android.R.drawable.ic_menu_save)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "저장을 완료 했습니다.", Toast.LENGTH_SHORT).show();
                                sa0.setSelected(false);
                                sa1.setSelected(false);
                                sa2.setSelected(false);
                                sa3.setSelected(false);
                                sa4.setSelected(false);
                                sa5.setSelected(false);
                                sa6.setSelected(false);
                                sa7.setSelected(false);
                                sa8.setSelected(true);
                                DayTimeDatabase db = Room.databaseBuilder(getApplicationContext(), DayTimeDatabase.class, "daytime.db")  //final
                                        .allowMainThreadQueries()          // main thread에서 db에 입출력 가능하게 함
                                        .fallbackToDestructiveMigration()  //스키마(Database) 버전 변경 가능
                                        .build();
                                dayTimeDao = db.dayTimeDao();
                                DayTime dayTime = new DayTime();

                                String moo = dayTimeDao.getmoo("토");
                                if (moo == null){
                                    dayTime.setDay("토");
                                    dayTime.setTime(1020);
                                    dayTimeDao.insert(dayTime);
                                }else{
                                    dayTimeDao.upse(1020);
                                }
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "취소하였습니다.",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });
    }
}