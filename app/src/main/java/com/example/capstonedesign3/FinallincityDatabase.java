package com.example.capstonedesign3;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Finallincity.class},version = 1)
public abstract class FinallincityDatabase extends RoomDatabase {
    private static FinallincityDatabase database;
    public abstract FinallincityDao finallincityDao();

    public synchronized static FinallincityDatabase getInstance(Context context){
        if(database==null){
            database = Room.databaseBuilder(context.getApplicationContext(),FinallincityDatabase.class,"finallincity.db").build();

        }
        return database;
    }
}
