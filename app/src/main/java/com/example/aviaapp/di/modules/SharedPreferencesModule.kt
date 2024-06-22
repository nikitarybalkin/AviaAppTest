package com.example.aviaapp.di.modules

import com.data.repositryImpls.SharedPreferenceRepositoryImpl
import com.example.domain.repositories.SharedPreferenceRepository
import dagger.Module
import dagger.Provides

@Module
class SharedPreferencesModule {

    @Provides
    fun providesSharedPreferencesRepository(impl: SharedPreferenceRepositoryImpl): SharedPreferenceRepository {
        return impl
    }

}