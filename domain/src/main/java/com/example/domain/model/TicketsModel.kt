package com.example.domain.model


class TicketsModel (
    val tickets_offers: List<TicketsOffer>
)

fun Tickets.mapToDomain() = TicketsModel(tickets_offers)

fun TicketsModel.mapToData() = Tickets(tickets_offers)