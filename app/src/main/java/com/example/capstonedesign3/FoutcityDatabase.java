package com.example.capstonedesign3;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Foutcity.class},version = 1)
public abstract class FoutcityDatabase extends RoomDatabase {
    private static FoutcityDatabase database;
    public abstract FoutcityDao foutcityDao();

    public synchronized static FoutcityDatabase getInstance(Context context){
        if(database==null){
            database= Room.databaseBuilder(context.getApplicationContext(),FoutcityDatabase.class,"foutcity.db").build();
        }
        return database;
    }
}
