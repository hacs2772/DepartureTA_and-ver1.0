package com.example.capstonedesign3;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities = {Fincity.class},version = 1)
public abstract class FincityDatabase extends RoomDatabase {
   private static FincityDatabase database;
   public abstract FincityDao fincityDao();

   public synchronized static FincityDatabase getInstance(Context context){
      if(database==null){
         database = Room.databaseBuilder(context.getApplicationContext(),FincityDatabase.class,"fincity.db").build();
      }
      return database;
   }

}
