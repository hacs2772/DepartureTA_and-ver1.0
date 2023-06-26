package com.example.capstonedesign3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;

public class Routescreen extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView detail0;
    TextView detail1;
    TextView detail2;
    TextView detail3;
    TextView detail4;
    TextView detail5;
    TextView detail6;
    TextView arrow1;
    TextView arrow2;
    TextView arrow3;
    TextView arrow4;
    TextView arrow5;
    TableLayout detail;
    Button button;
    private SuttleDao suttleDao;
    private FincityDao fincityDao;
    private FoutcityDao foutcityDao;
    private DayTimeDao dayTimeDao;
    private SelectedRouteDao routeDao;
    private FinallincityDao finallincityDao;
    private FinalloutcityDao finalloutcityDao;
    private Suttle suttle = new Suttle();
    private DayTime dayTime = new DayTime();
    private Fincity fincity = new Fincity();
    private Foutcity foutcity = new Foutcity();
    private Finallincity finallincity = new Finallincity();
    private Finalloutcity finalloutcity = new Finalloutcity();
    private SelectedRoute route = new SelectedRoute();
    private Button extra_move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routescreen);
        extra_move = findViewById(R.id.extra_move);
        extra_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Routescreen.this, Extra.class);
                startActivity(intent); // timescreen 이동
            }
        });
        SelectedRouteDatabase routeDatabase = Room.databaseBuilder(getApplicationContext(),SelectedRouteDatabase.class,"selectedroute.db")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
        routeDao = routeDatabase.selectedRouteDao();
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
        List<SelectedRoute> selectedRoutes = routeDao.getData(nowDay);
        if(selectedRoutes.size()>0){
            ViewSelect();
        } else {
            ViewDefalut();
        }
    }
    void ViewSelect(){
        SelectedRouteDatabase routeDatabase = Room.databaseBuilder(getApplicationContext(),SelectedRouteDatabase.class,"selectedroute.db")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
        routeDao = routeDatabase.selectedRouteDao();
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
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        TableLayout layout = (TableLayout) findViewById(R.id.detail);
        detail0 = (TextView) findViewById(R.id.detail0);
        detail1 = (TextView) findViewById(R.id.detail1);
        detail2 = (TextView) findViewById(R.id.detail2);
        detail3 = (TextView) findViewById(R.id.detail3);
        detail4 = (TextView) findViewById(R.id.detail4);
        detail5 = (TextView) findViewById(R.id.detail5);
        detail6 = (TextView) findViewById(R.id.detail6);
        arrow1 = (TextView) findViewById(R.id.arrow1);
        arrow2 = (TextView) findViewById(R.id.arrow2);
        arrow3 = (TextView) findViewById(R.id.arrow3);
        arrow4 = (TextView) findViewById(R.id.arrow4);
        arrow5 = (TextView) findViewById(R.id.arrow5);
        Button button = (Button) findViewById(R.id.bu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layout.getVisibility() == View.INVISIBLE) {
                    button.setText("\uD83D\uDD3A");
                    layout.setVisibility(View.VISIBLE);
                } else {
                    button.setText("\uD83D\uDD3B");
                    layout.setVisibility(View.INVISIBLE);
                }
            }
        });
        List<SelectedRoute> selectedRoutes = routeDao.getData(nowDay);
        if (selectedRoutes.get(0).getFirstpath().equals("null")){
            try {
                JSONArray jsonArray = new JSONArray(selectedRoutes.get(0).getSubpath());
                int i = jsonArray.length();
                DecimalFormat df = new DecimalFormat("###,###");
                String money = df.format(selectedRoutes.get(0).getFare());
                int hour = (int) Math.floor((double) selectedRoutes.get(0).getTotalTitme() / 60);
                int minute = selectedRoutes.get(0).getTotalTitme() % 60;
                switch (selectedRoutes.get(0).getPathtype()){
                    case 0 :
                        textView.setText("셔틀버스");
                        break;
                    case 1:
                        textView.setText("지하철");
                        break;
                    case 2:
                        textView.setText("시내버스");
                        break;
                    case 3:
                        textView.setText("버스+지하철");
                        break;
                }
                String t="";
                if (selectedRoutes.get(0).getArrtime()!=null){
                    t = selectedRoutes.get(0).getArrtime();
                }
                textView2.setText("출발시간 : " + selectedRoutes.get(0).getSchedule());
                if (jsonArray.getJSONObject(1).getString("type").equals("버스")) {
                    textView3.setText("출발정류소 : " + selectedRoutes.get(0).getStart() + " (" + selectedRoutes.get(0).getName() + " 버스)");
                    textView4.setText(t);
                } else {
                    textView3.setText("출발정류소 : " + selectedRoutes.get(0).getStart() + "역 (" + selectedRoutes.get(0).getName() + ")");
                }
                detail0.setText("소요시간 : " + hour + "시간 " + minute + "분" + "     요금 : " + money + "원");
                if (jsonArray.getJSONObject(1).getString("type").equals("지하철")) {
                    detail1.setText(jsonArray.getJSONObject(1).getString("start") + "역 (" + selectedRoutes.get(0).getName() + ")");
                } else {
                    detail1.setText(jsonArray.getJSONObject(1).getString("start") + " (" + selectedRoutes.get(0).getName() + " 버스)");
                }
                arrow1.setText("ↆ");
                detail2.setText(jsonArray.getJSONObject(1).getString("end"));
                if (i > 4) {
                    arrow2.setText("ↆ");
                    if (jsonArray.getJSONObject(2).get("type").equals("지하철")) {
                        detail3.setText(jsonArray.getJSONObject(3).getString("start"));
                    } else {
                        detail3.setText(jsonArray.getJSONObject(3).getString("start") + " (" + jsonArray.getJSONObject(3).getString("name") + " 버스)");
                    }
                    arrow3.setText("ↆ");
                    detail4.setText(jsonArray.getJSONObject(3).getString("end"));
                }
            } catch (Exception e) {
                e.toString();
            }
        } else {
            try {
                DecimalFormat df = new DecimalFormat("###,###");
                String money = df.format(selectedRoutes.get(0).getFare());
                int hour = (int) Math.floor((double) selectedRoutes.get(0).getTotalTitme() / 60);
                int minute = selectedRoutes.get(0).getTotalTitme() % 60;
                JSONObject jsonObject = new JSONObject(selectedRoutes.get(0).getFirstpath());
                JSONArray jsonArray = (JSONArray) jsonObject.get("subpath");
                JSONObject object = (JSONObject) jsonArray.getJSONObject(1);
                JSONObject jsonObject1 = new JSONObject(selectedRoutes.get(0).getSecondpath());
                JSONObject jsonObject2 = new JSONObject(selectedRoutes.get(0).getThirdpath());
                JSONArray jsonArray1 = (JSONArray) jsonObject2.get("subpath");
                JSONObject object1 = (JSONObject) jsonArray1.getJSONObject(1);
                String t="";
                if (selectedRoutes.get(0).getArrtime()!=null){
                    t = selectedRoutes.get(0).getArrtime();
                }
                textView.setText(selectedRoutes.get(0).getName());
                textView2.setText("출발시간 : " + selectedRoutes.get(0).getSchedule());
                if(object.get("type").equals("버스")){
                    textView3.setText("출발정류소 : " + selectedRoutes.get(0).getStart() + " (" + object.get("name") + " 버스)");
                    textView4.setText(t);
                } else {
                    textView3.setText("출발정류소 : " + selectedRoutes.get(0).getStart() + " (" + object.get("name") + " 역)");
                }
                detail0.setText("소요시간 : " + hour + "시간 " + minute + "분" + "    요금 : " + money + "원");
                if(object.get("type").equals("버스")){
                    detail1.setText(jsonObject.get("start").toString() + " (" + object.get("name") + " 버스)");
                } else {
                    detail1.setText(jsonObject.get("start").toString() + " (" + object.get("name") + " 역)");
                }
                arrow1.setText("ↆ");
                detail2.setText(jsonObject.get("end").toString());
                arrow2.setText("ↆ");
                detail3.setText(jsonObject1.get("start").toString() + " (" + selectedRoutes.get(0).getName() + ")");
                arrow3.setText("ↆ");
                detail4.setText(jsonObject1.get("end").toString());
                arrow4.setText("ↆ");
                detail5.setText(jsonObject2.get("start").toString() + " (" + object1.get("name") + " 버스)");
                arrow5.setText("ↆ");
                detail6.setText(jsonObject2.get("end").toString());
            } catch (Exception e) {
                e.toString();
            }

        }
    }
    void ViewDefalut() {
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
        List<Finallincity> finallincities = finallincityDao.getData(nowDay);
        List<Finalloutcity> finalloutcities = finalloutcityDao.getData(nowDay);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        TableLayout layout = (TableLayout) findViewById(R.id.detail);
        detail0 = (TextView) findViewById(R.id.detail0);
        detail1 = (TextView) findViewById(R.id.detail1);
        detail2 = (TextView) findViewById(R.id.detail2);
        detail3 = (TextView) findViewById(R.id.detail3);
        detail4 = (TextView) findViewById(R.id.detail4);
        detail5 = (TextView) findViewById(R.id.detail5);
        detail6 = (TextView) findViewById(R.id.detail6);
        arrow1 = (TextView) findViewById(R.id.arrow1);
        arrow2 = (TextView) findViewById(R.id.arrow2);
        arrow3 = (TextView) findViewById(R.id.arrow3);
        arrow4 = (TextView) findViewById(R.id.arrow4);
        arrow5 = (TextView) findViewById(R.id.arrow5);
        button = (Button) findViewById(R.id.bu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layout.getVisibility() == View.INVISIBLE) {
                    button.setText("상세경로 열기");
                    layout.setVisibility(View.VISIBLE);
                } else {
                    button.setText("상세경로 닫기");
                    layout.setVisibility(View.INVISIBLE);
                }
            }
        });
        if (finallincities.size() > 0 && finalloutcities.size() > 0) {
            if (finallincities.get(0).getTotalTime() > finalloutcities.get(0).getTotalTime()) {
                try {
                    DecimalFormat df = new DecimalFormat("###,###");
                    String money = df.format(finalloutcities.get(0).getFare());
                    int hour = (int) Math.floor((double) finalloutcities.get(0).getTotalTime() / 60);
                    int minute = finalloutcities.get(0).getTotalTime() % 60;
                    JSONObject jsonObject = new JSONObject(finalloutcities.get(0).getFirstpath());
                    JSONArray jsonArray = (JSONArray) jsonObject.get("subpath");
                    JSONObject object = (JSONObject) jsonArray.getJSONObject(1);
                    JSONObject jsonObject1 = new JSONObject(finalloutcities.get(0).getSecondpath());
                    JSONObject jsonObject2 = new JSONObject(finalloutcities.get(0).getThirdpath());
                    JSONArray jsonArray1 = (JSONArray) jsonObject2.get("subpath");
                    JSONObject object1 = (JSONObject) jsonArray1.getJSONObject(1);
                    String t="";
                    if (finalloutcities.get(0).getArrtime()!=null){
                        t = finalloutcities.get(0).getArrtime();
                    }
                    textView.setText(finalloutcities.get(0).getName());
                    textView2.setText("출발시간 : " + finalloutcities.get(0).getSchedule());
                    if(object.get("type").equals("버스")){
                        textView3.setText("출발정류소 : " + finalloutcities.get(0).getStart() + " (" + object.get("name") + " 버스)");
                        textView4.setText(t);
                    } else {
                        textView3.setText("출발정류소 : " + finalloutcities.get(0).getStart() + " (" + object.get("name") + " 역)");
                    }
                    detail0.setText("소요시간 : " + hour + "시간 " + minute + "분" + "    요금 : " + money + "원");
                    if(object.get("type").equals("버스")){
                        detail1.setText(jsonObject.get("start").toString() + " (" + object.get("name") + " 버스)");
                    } else {
                        detail1.setText(jsonObject.get("start").toString() + " (" + object.get("name") + " 역)");
                    }
                    arrow1.setText("ↆ");
                    detail2.setText(jsonObject.get("end").toString());
                    arrow2.setText("ↆ");
                    detail3.setText(jsonObject1.get("start").toString() + " (" + finalloutcities.get(0).getName() + ")");
                    arrow3.setText("ↆ");
                    detail4.setText(jsonObject1.get("end").toString());
                    arrow4.setText("ↆ");
                    detail5.setText(jsonObject2.get("start").toString() + " (" + object1.get("name") + " 버스)");
                    arrow5.setText("ↆ");
                    detail6.setText(jsonObject2.get("end").toString());
                } catch (Exception e) {
                    e.toString();
                }
            } else {
                try {
                    JSONArray jsonArray = new JSONArray(finallincities.get(0).getSubpath());
                    int i = jsonArray.length();
                    DecimalFormat df = new DecimalFormat("###,###");
                    String money = df.format(finallincities.get(0).getFare());
                    int hour = (int) Math.floor((double) finallincities.get(0).getTotalTime() / 60);
                    int minute = finallincities.get(0).getTotalTime() % 60;
                    String t="";
                    if (finallincities.get(0).getArrtime()!=null){
                        t = finallincities.get(0).getArrtime();
                    }
                    switch (finallincities.get(0).getPathtype()){
                        case 0:
                            textView.setText("셔틀버스");
                            break;
                        case 1:
                            textView.setText("지하철");
                            break;
                        case 2:
                            textView.setText("버스");
                            break;
                        case 3:
                            textView.setText("버스+지하철");
                            break;
                    }
                    textView2.setText("출발시간 : " + finallincities.get(0).getSchedule());
                    if (jsonArray.getJSONObject(1).getString("type").equals("버스")) {
                        textView3.setText("출발정류소 : " + finallincities.get(0).getStart() + " (" + finallincities.get(0).getName() + " 버스)" );
                        textView4.setText(t);
                    } else {
                        textView3.setText("출발정류소 : " + finallincities.get(0).getStart() + "역 (" + finallincities.get(0).getName() + ")");
                    }
                    detail0.setText("소요시간 : " + hour + "시간 " + minute + "분" + "     요금 : " + money + "원");
                    if (jsonArray.getJSONObject(1).getString("type").equals("지하철")) {
                        detail1.setText(jsonArray.getJSONObject(1).getString("start") + "역 (" + finallincities.get(0).getName() + ")");
                    } else {
                        detail1.setText(jsonArray.getJSONObject(1).getString("start") + " (" + finallincities.get(0).getName() + " 버스)");
                    }
                    arrow1.setText("ↆ");
                    detail2.setText(jsonArray.getJSONObject(1).getString("end"));
                    if (i > 4) {
                        arrow2.setText("ↆ");
                        if (jsonArray.getJSONObject(2).get("type").equals("지하철")) {
                            detail3.setText(jsonArray.getJSONObject(3).getString("start"));
                        } else {
                            detail3.setText(jsonArray.getJSONObject(3).getString("start") + " (" + jsonArray.getJSONObject(3).getString("name") + " 버스)");
                        }
                        arrow3.setText("ↆ");
                        detail4.setText(jsonArray.getJSONObject(3).getString("end"));
                    }
                } catch (Exception e) {
                    e.toString();
                }
            }
        } else if (finallincities.size() == 0 && finalloutcities.size() == 0) {
            textView.setText("일정이 없습니다.");
            button.setVisibility(View.INVISIBLE);
        } else {
            if (finallincities.size()>0){
                try {
                    JSONArray jsonArray = new JSONArray(finallincities.get(0).getSubpath());
                    int i = jsonArray.length();
                    DecimalFormat df = new DecimalFormat("###,###");
                    String money = df.format(finallincities.get(0).getFare());
                    int hour = (int) Math.floor((double) finallincities.get(0).getTotalTime() / 60);
                    int minute = finallincities.get(0).getTotalTime() % 60;
                    String t="";
                    if (finallincities.get(0).getArrtime()!=null){
                        t = finallincities.get(0).getArrtime();
                    }
                    switch (finallincities.get(0).getPathtype()){
                        case 0:
                            textView.setText("셔틀버스");
                            break;
                        case 1:
                            textView.setText("지하철");
                            break;
                        case 2:
                            textView.setText("버스");
                            break;
                        case 3:
                            textView.setText("버스+지하철");
                            break;
                    }
                    textView2.setText("출발시간 : " + finallincities.get(0).getSchedule());
                    if (jsonArray.getJSONObject(1).getString("type").equals("버스")) {
                        textView3.setText("출발정류소 : " + finallincities.get(0).getStart() + " (" + finallincities.get(0).getName() + " 버스)" );
                        textView4.setText(t);
                    } else {
                        textView3.setText("출발정류소 : " + finallincities.get(0).getStart() + "역 (" + finallincities.get(0).getName() + ")");
                    }
                    detail0.setText("소요시간 : " + hour + "시간 " + minute + "분" + "     요금 : " + money + "원");
                    if (jsonArray.getJSONObject(1).getString("type").equals("지하철")) {
                        detail1.setText(jsonArray.getJSONObject(1).getString("start") + "역 (" + finallincities.get(0).getName() + ")");
                    } else {
                        detail1.setText(jsonArray.getJSONObject(1).getString("start") + " (" + finallincities.get(0).getName() + " 버스)");
                    }
                    arrow1.setText("ↆ");
                    detail2.setText(jsonArray.getJSONObject(1).getString("end"));
                    if (i > 4) {
                        arrow2.setText("ↆ");
                        if (jsonArray.getJSONObject(2).get("type").equals("지하철")) {
                            detail3.setText(jsonArray.getJSONObject(3).getString("start"));
                        } else {
                            detail3.setText(jsonArray.getJSONObject(3).getString("start") + " (" + jsonArray.getJSONObject(3).getString("name") + " 버스)");
                        }
                        arrow3.setText("ↆ");
                        detail4.setText(jsonArray.getJSONObject(3).getString("end"));
                    }
                } catch (Exception e) {
                    e.toString();
                }
            } else {
                try {
                    DecimalFormat df = new DecimalFormat("###,###");
                    String money = df.format(finalloutcities.get(0).getFare());
                    int hour = (int) Math.floor((double) finalloutcities.get(0).getTotalTime() / 60);
                    int minute = finalloutcities.get(0).getTotalTime() % 60;
                    JSONObject jsonObject = new JSONObject(finalloutcities.get(0).getFirstpath());
                    JSONArray jsonArray = (JSONArray) jsonObject.get("subpath");
                    JSONObject object = (JSONObject) jsonArray.getJSONObject(1);
                    JSONObject jsonObject1 = new JSONObject(finalloutcities.get(0).getSecondpath());
                    JSONObject jsonObject2 = new JSONObject(finalloutcities.get(0).getThirdpath());
                    JSONArray jsonArray1 = (JSONArray) jsonObject2.get("subpath");
                    JSONObject object1 = (JSONObject) jsonArray1.getJSONObject(1);
                    String t="";
                    if (finalloutcities.get(0).getArrtime()!=null){
                        t = finalloutcities.get(0).getArrtime();
                    }
                    textView.setText(finalloutcities.get(0).getName());
                    textView2.setText("출발시간 : " + finalloutcities.get(0).getSchedule());
                    if(object.get("type").equals("버스")){
                        textView3.setText("출발정류소 : " + finalloutcities.get(0).getStart() + " (" + object.get("name") + " 버스)");
                        textView4.setText(t);
                    } else {
                        textView3.setText("출발정류소 : " + finalloutcities.get(0).getStart() + " (" + object.get("name") + " 역)");
                    }
                    detail0.setText("소요시간 : " + hour + "시간 " + minute + "분" + "    요금 : " + money + "원");
                    if(object.get("type").equals("버스")){
                        detail1.setText(jsonObject.get("start").toString() + " (" + object.get("name") + " 버스)");
                    } else {
                        detail1.setText(jsonObject.get("start").toString() + " (" + object.get("name") + " 역)");
                    }
                    arrow1.setText("ↆ");
                    detail2.setText(jsonObject.get("end").toString());
                    arrow2.setText("ↆ");
                    detail3.setText(jsonObject1.get("start").toString() + " (" + finalloutcities.get(0).getName() + ")");
                    arrow3.setText("ↆ");
                    detail4.setText(jsonObject1.get("end").toString());
                    arrow4.setText("ↆ");
                    detail5.setText(jsonObject2.get("start").toString() + " (" + object1.get("name") + " 버스)");
                    arrow5.setText("ↆ");
                    detail6.setText(jsonObject2.get("end").toString());
                } catch (Exception e){
                    e.toString();
                }
            }
        }

    }
}