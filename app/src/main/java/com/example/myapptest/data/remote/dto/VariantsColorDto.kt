package com.example.myapptest.data.remote.dto

import com.squareup.moshi.Json

data class VariantsColorDto(
    @field:Json(name ="colorName"     ) var colorName     : String? = null,
    @field:Json(name ="colorHex"      ) var colorHex      : String? = null,
    @field:Json(name ="colorImageURL" ) var colorImageURL : String? = null,
    @field:Json(name ="colorMainURL"  ) var colorMainURL  : String? = null,
    @field:Json(name ="skuId"         ) var skuId         : String? = null
)
