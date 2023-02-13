package com.example.myapptest.data.remote.dto

import com.squareup.moshi.Json

data class SortOptionsDto(
    @field:Json(name ="sortBy" ) var sortBy : String? = null,
    @field:Json(name ="label"  ) var label  : String? = null
)
