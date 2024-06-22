package com.data

data class ButtonFunction(
    var name: String,
    var action: ()->Unit,
    var url: Int?
)
