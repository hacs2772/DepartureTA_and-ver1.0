package com.example.capstonedesign3;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Suttle")
public class Suttle {
    @PrimaryKey(autoGenerate = true)
    private int id = 0;
    private int fare;
    private int totaltime;
    private String name;
    private int pathtype;
    private String subpath;
    private String start;
    private String schedule;
    private String day;
    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
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

    public int getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(int totaltime) {
        this.totaltime = totaltime;
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

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
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
}
