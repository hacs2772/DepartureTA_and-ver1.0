package com.example.capstonedesign3;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DayTimeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(DayTime dayTime);

    @Delete
    void delete(DayTime dayTime);

    @Update
    void update(DayTime dayTime);

    @Query("SELECT * FROM DayTime")
    List<DayTime> getDayTimeAll();

    @Query("UPDATE DayTime SET time =:time WHERE day ='월'")
    void upmon(int time);

    @Query("UPDATE DayTime SET time =:time WHERE day ='화'")
    void uptu(int time);

    @Query("UPDATE DayTime SET time =:time WHERE day ='수'")
    void upwe(int time);

    @Query("UPDATE DayTime SET time =:time WHERE day ='목'")
    void upth(int time);

    @Query("UPDATE DayTime SET time =:time WHERE day ='금'")
    void upfr(int time);

    @Query("UPDATE DayTime SET time =:time WHERE day ='토'")
    void upse(int time);


    @Query("SELECT day FROM DayTime WHERE day =:day")
    String getmoo(String day);

    @Query("SELECT time FROM DayTime WHERE day=:day")
    int gettime(String day);

    @Query("UPDATE DayTime SET time =:time WHERE day=:day")
    void updateday(int time, String day);

    @Query("DELETE FROM DayTime")
    void del();

    @Query("SELECT * FROM DayTime WHERE day=:day")
    List<DayTime> getDay(String day);
}
