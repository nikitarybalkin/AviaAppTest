package com.example.domain.repositories

interface SharedPreferenceRepository {
    fun saveData(key:String, value:String)

    fun getData(key: String): String?
}