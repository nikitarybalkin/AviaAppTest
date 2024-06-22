package com.data.dataSources

import com.example.domain.model.Offers

interface OffersRemoteDataSource {

    suspend fun getOffers(): Offers

}