package com.example.aviaapp.domain.model

import com.example.aviaapp.domain.apiModel.model.Tickets
import com.example.aviaapp.domain.apiModel.model.TicketsOffer

class TicketsModel (
    val tickets_offers: List<TicketsOffer>
)

fun Tickets.mapToDomain() = TicketsModel(tickets_offers)

fun TicketsModel.mapToData() = Tickets(tickets_offers)