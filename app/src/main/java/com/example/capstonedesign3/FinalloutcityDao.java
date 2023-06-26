package com.example.capstonedesign3;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FinalloutcityDao {
    @Insert
    void insert(Finalloutcity finalloutcity);

    @Update
    void update(Finalloutcity finalloutcity);

    @Delete
    void delete(Finalloutcity finalloutcity);

    @Query("SELECT * FROM Finalloutcity")
    List<Finalloutcity> getFinalloutcityAll();



    @Query("UPDATE Finalloutcity SET Arrtime = :arrtime WHERE Id = :id")
    void updateset(String arrtime, int id);

    @Query("SELECT * FROM Finalloutcity WHERE Day = :day")
    List<Finalloutcity> getFday(String day);

    @Query("SELECT DISTINCT * FROM Finalloutcity WHERE Day = :day ORDER BY totalTime ASC")
    List<Finalloutcity> getData(String day);

    @Query("DELETE FROM Finalloutcity WHERE Day = :day")
    void delday(String day);

}
