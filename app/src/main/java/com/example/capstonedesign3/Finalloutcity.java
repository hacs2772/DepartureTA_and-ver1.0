package com.example.capstonedesign3;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Finalloutcity")
public class Finalloutcity {
    @PrimaryKey(autoGenerate = true)
    private int id =0;

    private int fare;

    private int totalTime;

    private String name;

    private int pathtype;

    private String firstpath;

    private String secondpath;

    private String thirdpath;

    private String schedule;

    private String day;

    private String start;

    private String arrtime;

    public String getArrtime() {
        return arrtime;
    }

    public void setArrtime(String arrtime) {
        this.arrtime = arrtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPathtype() {
        return pathtype;
    }

    public void setPathtype(int pathtype) {
        this.pathtype = pathtype;
    }

    public String getFirstpath() {
        return firstpath;
    }

    public void setFirstpath(String firstpath) {
        this.firstpath = firstpath;
    }

    public String getSecondpath() {
        return secondpath;
    }

    public void setSecondpath(String secondpath) {
        this.secondpath = secondpath;
    }

    public String getThirdpath() {
        return thirdpath;
    }

    public void setThirdpath(String thirdpath) {
        this.thirdpath = thirdpath;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }
}
