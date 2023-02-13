package com.example.myapptest.data.remote.dto

import com.squareup.moshi.Json

data class AncesterDto(
    @field:Json(name ="label"      ) var label      : String? = null,
    @field:Json(name ="categoryId" ) var categoryId : String? = null
)
