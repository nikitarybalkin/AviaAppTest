package com.example.aviaapp.domain.model



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