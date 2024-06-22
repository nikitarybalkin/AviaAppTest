package com.example.aviaapp.di.modules

import com.data.api.AllTicketsAPI
import com.data.api.OffersAPI
import com.data.api.TicketsAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {

    @Provides
    fun providesRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://run.mocky.io")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Provides
    fun providesOffersAPI(retrofit: Retrofit): OffersAPI {
        return retrofit.create(OffersAPI::class.java)
    }

    @Provides
    fun providesTicketsAPI(retrofit: Retrofit): TicketsAPI {
        return retrofit.create(TicketsAPI::class.java)
    }

    @Provides
    fun providesAllTicketsAPI(retrofit: Retrofit): AllTicketsAPI {
        return retrofit.create(AllTicketsAPI::class.java)
    }

}