package com.example.aviapp.data.api

import com.example.aviaapp.domain.apiModel.model.Tickets
import retrofit2.http.GET

interface TicketsAPI {

    @GET("v3/7e55bf02-89ff-4847-9eb7-7d83ef884017")
    suspend fun getTickets(): Tickets
}