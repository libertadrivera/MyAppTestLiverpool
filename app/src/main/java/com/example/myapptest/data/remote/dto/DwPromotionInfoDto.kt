package com.example.myapptest.data.remote.dto

import com.squareup.moshi.Json

data class DwPromotionInfoDto(
    @field:Json(name ="dwToolTipInfo"      ) var dwToolTipInfo      : String? = null,
    @field:Json(name ="dWPromoDescription" ) var dWPromoDescription : String? = null
)
