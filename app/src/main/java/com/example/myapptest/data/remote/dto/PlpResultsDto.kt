package com.example.myapptest.data.remote.dto

import com.squareup.moshi.Json

data class PlpResultsDto(
    @field:Json(name ="label"            ) var label            : String?                     = null,
    @field:Json(name ="plpState"         ) var plpState         : PlpStateDto?                   = PlpStateDto(),
    @field:Json(name ="sortOptions"      ) var sortOptions      : List<SortOptionsDto>? = null,
    @field:Json(name ="refinementGroups" ) var refinementGroups : List<RefinementGroupsDto>? = null,
    @field:Json(name ="records"          ) var records          : List<RecordsDto>? = null,
    @field:Json(name ="navigation"       ) var navigation       : NavigationDto?                 = NavigationDto()
    //@field:Json(name ="customUrlParam"   ) var customUrlParam   : CustomUrlParam?             = CustomUrlParam()
)
