package com.example.capstonedesign3;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.Collections;

@Database(entities = {SelectedRoute.class},version=1)
public abstract class SelectedRouteDatabase extends RoomDatabase {
    private static SelectedRouteDatabase database;
    public abstract SelectedRouteDao selectedRouteDao();

    public synchronized static SelectedRouteDatabase getInstance(Context context){
        if(database==null){
            database = Room.databaseBuilder(context.getApplicationContext(),SelectedRouteDatabase.class,"selectedroute.db")
                    .build();
        }
        return database;
    }
}
