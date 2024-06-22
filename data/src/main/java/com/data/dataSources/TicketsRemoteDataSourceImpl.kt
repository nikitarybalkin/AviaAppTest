package com.data.dataSources

import com.data.api.TicketsAPI
import com.example.domain.model.Tickets
import javax.inject.Inject

class TicketsRemoteDataSourceImpl @Inject constructor(private val api: TicketsAPI):
    TicketsRemoteDataSource {
    override suspend fun getTickets(): Tickets {
        return api.getTickets()
    }

}