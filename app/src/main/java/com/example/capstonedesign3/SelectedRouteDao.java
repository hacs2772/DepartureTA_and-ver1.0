package com.example.capstonedesign3;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface SelectedRouteDao {
    @Insert
    void insert(SelectedRoute selectedRoute);

    @Query("DELETE FROM SelectedRoute WHERE Day=:day")
    void del(String day);

    @Query("SELECT * FROM SelectedRoute WHERE Day = :day")
    List<SelectedRoute> getData(String day);
}
