package com.example.aviapp.data.repositryImpls


import com.example.aviaapp.domain.repositories.OffersRepository
import com.example.aviaapp.domain.model.OffersModel
import com.example.aviaapp.domain.model.mapToDomain
import com.example.aviapp.data.dataSources.OffersRemoteDataSource
import javax.inject.Inject

class OffersRepositoryImpl @Inject constructor(private val offersRemoteDataSource: OffersRemoteDataSource):
    OffersRepository {
    override suspend fun getOffers(): OffersModel {
        return offersRemoteDataSource.getOffers().mapToDomain()
    }

}