package com.example.aviaapp.di.modules

import com.data.dataSources.AllTicketsRemoteDataSource
import com.data.dataSources.AllTicketsRemoteDataSourceImpl
import com.data.repositryImpls.AllTicketsRepositoryImpl
import com.data.dataSources.OffersRemoteDataSource
import com.data.dataSources.OffersRemoteDataSourceIMpl
import com.data.repositryImpls.OffersRepositoryImpl
import com.data.dataSources.TicketsRemoteDataSource
import com.data.dataSources.TicketsRemoteDataSourceImpl
import com.data.repositryImpls.TicketsRepositoryImpl
import com.example.domain.repositories.AllTicketsRepository
import com.example.domain.repositories.OffersRepository
import com.example.domain.repositories.TicketsRepository
import dagger.Module
import dagger.Provides

@Module
class ApiModule {

    @Provides
    fun providesOffersRemoteDataSource(offersRemoteDataSourceIMpl: OffersRemoteDataSourceIMpl): OffersRemoteDataSource {
        return offersRemoteDataSourceIMpl
    }

    @Provides
    fun providesOffersRepository(offersRepositoryImpl: OffersRepositoryImpl): OffersRepository {
        return offersRepositoryImpl
    }

    @Provides
    fun providesTicketsRemoteDataSource(ticketsRemoteDataSourceImpl: TicketsRemoteDataSourceImpl): TicketsRemoteDataSource {
        return ticketsRemoteDataSourceImpl
    }

    @Provides
    fun providesTicketsRepository(ticketsRepositoryImpl: TicketsRepositoryImpl): TicketsRepository {
        return ticketsRepositoryImpl
    }

    @Provides
    fun providesAllTicketsRemoteDataSource(allTicketsRemoteDataSourceImpl: AllTicketsRemoteDataSourceImpl): AllTicketsRemoteDataSource {
        return allTicketsRemoteDataSourceImpl
    }

    @Provides
    fun providesAllTicketsRepository(allTicketsRepositoryImpl: AllTicketsRepositoryImpl): AllTicketsRepository {
        return allTicketsRepositoryImpl
    }
}