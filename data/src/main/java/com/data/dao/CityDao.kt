package com.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.domain.entities.CityEntity
import kotlinx.coroutines.flow.Flow
//Так как, в ТЗ не было указано где использовать БД и на hh.ru мне не ответили на этот вопрос, я реализовал БД, но нигде не использовал
@Dao
interface CityDao {
    @Query("SELECT * FROM cityTable")
    fun getAll(): Flow<List<CityEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(table: CityEntity)

    @Query("DELETE FROM cityTable")
    suspend fun deleteAll()
}