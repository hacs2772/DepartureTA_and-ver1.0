package com.example.capstonedesign3;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao
public interface FincityDao {
    @Insert
    void insert(Fincity fincities);

    @Update
    void update(Fincity fincities);

    @Delete
    void delete(Fincity fincities);

    @Query("SELECT * FROM Fincity")
    List<Fincity> getFincityAll();

    @Query("DELETE FROM Fincity")
    void clearAll();
}
