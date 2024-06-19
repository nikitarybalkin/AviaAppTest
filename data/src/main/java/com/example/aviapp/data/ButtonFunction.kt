package com.example.aviapp.data

data class ButtonFunction(
    var name: String,
    var action: ()->Unit,
    var url: Int?
)
