package com.example.capstonedesign3;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {DayTime.class},version = 1)
public abstract class DayTimeDatabase extends RoomDatabase {
    private static DayTimeDatabase database;
    public abstract DayTimeDao dayTimeDao();

    public synchronized static DayTimeDatabase getInstance(Context context){
        if(database==null){
            database = Room.databaseBuilder(context.getApplicationContext(),DayTimeDatabase.class,"daytime.db").build();
        }
        return database;
    }
}
