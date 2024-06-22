package com.example.aviaapp.di.modules

import android.content.Context
import androidx.room.Room
import com.data.dao.CityDao
import com.data.dataSources.CityLocalDataSource
import com.data.dataSources.CityLocalDataSourceImpl
import com.data.repositryImpls.CityRepositoryImpl
import com.example.aviaapp.di.AppDataBase
import com.example.domain.repositories.CityRepository
import dagger.Module
import dagger.Provides

@Module
class DataBaseModule {
    @Provides
    fun provideDataBase(context: Context): AppDataBase {
        return Room.databaseBuilder(context, AppDataBase::class.java, "db")
            .fallbackToDestructiveMigration().build()
    }
    @Provides
    fun provideCityDao(db: AppDataBase): CityDao {
        return db.cityDao()
    }
    @Provides
    fun provideCityRepository(cityRepositoryImpl: CityRepositoryImpl): CityRepository {
        return cityRepositoryImpl
    }
    @Provides
    fun provideCityDataSource(cityLocalDataSourceImpl: CityLocalDataSourceImpl): CityLocalDataSource {
        return cityLocalDataSourceImpl
    }
}