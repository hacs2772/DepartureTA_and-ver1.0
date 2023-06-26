package com.example.capstonedesign3;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.Collections;

@Database(entities = {Suttle.class},version = 1)
public abstract class SuttleDatabase extends RoomDatabase {
    private static SuttleDatabase database;
    public abstract SuttleDao suttleDao();

    public synchronized static SuttleDatabase getInstance(Context context){
        if(database==null){
            database = Room.databaseBuilder(context.getApplicationContext(),SuttleDatabase.class,"suttle.db").build();
        }
        return database;
    }
}
