package com.example.myapptest.data.remote.dto

import com.squareup.moshi.Json

data class StatusDto(
    @field:Json(name ="status"     ) var status     : String? = null,
    @field:Json(name ="statusCode" ) var statusCode : Int?    = null
)
