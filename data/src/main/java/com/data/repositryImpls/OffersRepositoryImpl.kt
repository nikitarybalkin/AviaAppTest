package com.data.repositryImpls

import com.data.dataSources.OffersRemoteDataSource
import com.example.domain.repositories.OffersRepository
import com.example.domain.model.OffersModel
import com.example.domain.model.mapToDomain
import javax.inject.Inject

class OffersRepositoryImpl @Inject constructor(private val offersRemoteDataSource: OffersRemoteDataSource):
    OffersRepository {
    override suspend fun getOffers(): OffersModel {
        return offersRemoteDataSource.getOffers().mapToDomain()
    }

}