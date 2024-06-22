package com.example.domain.model

import com.example.domain.entities.CityEntity

class CityModel (
    val id: Int = 0,
    val city: String
)
fun CityEntity.mapToDomain() = CityModel(
    id,
    city
)
fun CityModel.mapToData() = CityEntity(
    id,
    city
)