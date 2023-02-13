package com.example.myapptest.data.remote.dto

import com.squareup.moshi.Json

data class ProductListResponseDto(
    @field:Json(name ="status"     ) var status     : StatusDto?     = StatusDto(),
    @field:Json(name ="pageType"   ) var pageType   : String?     = null,
    @field:Json(name ="plpResults" ) var plpResults : PlpResultsDto? = PlpResultsDto()
)
