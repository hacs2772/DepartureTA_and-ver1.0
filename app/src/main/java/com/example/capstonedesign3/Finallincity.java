package com.example.capstonedesign3;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Finallincity")
public class Finallincity {
    @PrimaryKey(autoGenerate = true)
    private int id =0;

    private int fare;

    private int totalTime;

    private String name;

    private int pathtype;

    private String subpath;

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

    public String getSubpath() {
        return subpath;
    }

    public void setSubpath(String subpath) {
        this.subpath = subpath;
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
