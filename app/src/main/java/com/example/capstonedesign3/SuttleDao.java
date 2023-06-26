package com.example.capstonedesign3;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface SuttleDao {
    @Insert
    void insert(Suttle suttle);

    @Update
    void update(Suttle suttle);

    @Delete
    void delete(Suttle suttle);

    @Query("SELECT * FROM Suttle")
    List<Suttle> getSuttle();

    @Query("DELETE FROM Suttle")
    void clearAll();
}
