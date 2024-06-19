package com.example.aviapp.data.api

import com.example.aviaapp.domain.apiModel.model.Offers
import retrofit2.http.GET

interface OffersAPI {

    @GET("/v3/214a1713-bac0-4853-907c-a1dfc3cd05fd")
    suspend fun getOffers(): Offers
}