package com.example.capstonedesign3;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.DeleteTable;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FoutcityDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Foutcity foutcity);

    @Update
    void update(Foutcity foutcity);

    @Delete
    void delete(Foutcity foutcity);

    @Query("SELECT * FROM Foutcity")
    List<Foutcity> getFoutctiyAll();

    @Query("DELETE FROM Foutcity")
    void clearAll();
}
