package com.example.capstonedesign3;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import org.w3c.dom.ls.LSException;

import java.util.List;

@Dao
public interface FinallincityDao {
    @Insert
    void insert(Finallincity finallincity);

    @Update
    void update(Finallincity finallincity);

    @Delete
    void delete(Finallincity finallincity);

    @Query("SELECT schedule From Finallincity WHERE Day =:day")
    String getsc(String day);

    @Query("UPDATE Finallincity SET Arrtime = :arrtime WHERE Id = :id")
    void updateset(String arrtime, int id);

    @Query("SELECT DISTINCT * FROM Finallincity WHERE Day = :day ORDER BY totalTime ASC")
    List<Finallincity> getData(String day);

    @Query("SELECT * FROM Finallincity")
    List<Finallincity> getFinallincityAll();

    @Query("SELECT * FROM Finallincity WHERE Day = :day")
    List<Finallincity> getFinday(String day);

    @Query("DELETE FROM Finallincity WHERE Day = :day")
    void delday(String day);
}
