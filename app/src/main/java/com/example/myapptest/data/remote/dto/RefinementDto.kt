package com.example.myapptest.data.remote.dto

import com.squareup.moshi.Json

data class RefinementDto(
    @field:Json(name ="count"        ) var count        : Int?     = null,
    @field:Json(name ="label"        ) var label        : String?  = null,
    @field:Json(name ="refinementId" ) var refinementId : String?  = null,
    @field:Json(name ="selected"     ) var selected     : Boolean? = null,
    @field:Json(name ="type"         ) var type         : String?  = null,
    @field:Json(name ="searchName"   ) var searchName   : String?  = null
)
