package com.example.aviapp.data.dataSources

import com.example.aviaapp.domain.apiModel.model.Tickets
import com.example.aviapp.data.api.TicketsAPI
import javax.inject.Inject

class TicketsRemoteDataSourceImpl @Inject constructor(private val api: TicketsAPI):
    TicketsRemoteDataSource {
    override suspend fun getTickets(): Tickets {
        return api.getTickets()
    }

}