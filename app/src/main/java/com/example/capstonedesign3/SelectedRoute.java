package com.example.capstonedesign3;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "SelectedRoute")
public class SelectedRoute {
    @PrimaryKey(autoGenerate = true)
    private int id =0;
    private int fare;
    private int totalTitme;
    private String name;
    private int pathtype;
    private String subpath;
    private String firstpath;
    private String secondpath;
    private String thirdpath;
    private String schedule;
    private String day;

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

    public int getTotalTitme() {
        return totalTitme;
    }

    public void setTotalTitme(int totalTitme) {
        this.totalTitme = totalTitme;
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

    public String getArrtime() {
        return arrtime;
    }

    public void setArrtime(String arrtime) {
        this.arrtime = arrtime;
    }

    private String start;
    private String arrtime;
}
