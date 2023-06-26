package com.example.capstonedesign3;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Finalloutcity.class}, version = 1)
public abstract class FinalloutcityDatabase extends RoomDatabase {
    private static FinalloutcityDatabase database;
    public abstract FinalloutcityDao finalloutcityDao();

    public synchronized static FinalloutcityDatabase getInstance(Context context){
        if(database == null){
            database = Room.databaseBuilder(context.getApplicationContext(),FinalloutcityDatabase.class,"finalloutcity.db").build();
        }
        return database;
    }

}
