package com.example.myapptest.data.remote.dto

import com.squareup.moshi.Json

data class RefinementGroupsDto(
    @field:Json(name ="name"          ) var name          : String?               = null,
    @field:Json(name ="refinement"    ) var refinement    : List<RefinementDto>? = null,
    @field:Json(name ="multiSelect"   ) var multiSelect   : Boolean?              = null,
    @field:Json(name ="dimensionName" ) var dimensionName : String?               = null
)
