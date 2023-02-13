package com.example.myapptest.data.remote.dto

import com.squareup.moshi.Json

data class NavigationDto(
    @field:Json(name ="ancester" ) var ancester : List<AncesterDto>? = null,
    @field:Json(name ="current"  ) var current  : List<CurrentDto>? = null,
    @field:Json(name ="childs"   ) var childs   : List<String>? = null
)
