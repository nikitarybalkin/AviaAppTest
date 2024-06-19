package com.example.aviaapp.domain.model

import com.example.aviaapp.domain.apiModel.model.AllTickets
import com.example.aviaapp.domain.apiModel.model.Ticket

class AllTicketsModel (
    val tickets: List<Ticket>
)
fun AllTickets.mapToDomain() = AllTicketsModel (
    tickets
)

fun AllTicketsModel.mapToData() = AllTickets(
    tickets
)

