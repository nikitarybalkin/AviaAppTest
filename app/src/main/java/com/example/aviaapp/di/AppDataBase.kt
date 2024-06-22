package com.example.aviaapp.di

import androidx.room.Database
import androidx.room.RoomDatabase
import com.data.dao.CityDao
import com.example.domain.entities.CityEntity

@Database(entities = [CityEntity::class], version = 1, exportSchema = false)

abstract class AppDataBase : RoomDatabase() {
    abstract fun cityDao() : CityDao
}