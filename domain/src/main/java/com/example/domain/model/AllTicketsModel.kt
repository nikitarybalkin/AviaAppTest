package com.example.domain.model

class AllTicketsModel (
    val tickets: List<Ticket>
)
fun AllTickets.mapToDomain() = AllTicketsModel (
    tickets
)

fun AllTicketsModel.mapToData() = AllTickets(
    tickets
)

