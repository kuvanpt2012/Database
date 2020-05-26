package com.example.roomdatabase.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.roomdatabase.model.entity.Sinhvien;

@Database(entities = Sinhvien.class , version = 1)
public abstract class SinhvienDatabase extends RoomDatabase {
    public abstract SInhvienDAO sInhvienDAO();

}
