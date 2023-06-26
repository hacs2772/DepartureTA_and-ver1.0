package com.example.capstonedesign3;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "DayTime")
public class DayTime {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private int time;

    private String day;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
