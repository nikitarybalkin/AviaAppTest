package com.data.repositryImpls

import android.content.Context
import com.example.domain.repositories.SharedPreferenceRepository
import javax.inject.Inject

class SharedPreferenceRepositoryImpl @Inject constructor(private val context: Context):
    SharedPreferenceRepository {

    private val sharedPreferences = context.getSharedPreferences("name_of_city", Context.MODE_PRIVATE)
    override fun saveData(key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    override fun getData(key: String): String? {
        return sharedPreferences.getString(key, null)
    }

}