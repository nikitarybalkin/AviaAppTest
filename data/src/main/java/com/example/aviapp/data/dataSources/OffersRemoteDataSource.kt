package com.example.aviapp.data.dataSources

import com.example.aviaapp.domain.apiModel.model.Offers


interface OffersRemoteDataSource {

    suspend fun getOffers(): Offers

}