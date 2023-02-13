package com.example.myapptest.data.remote.dto

import com.squareup.moshi.Json

data class PlpStateDto (
    @field:Json(name ="categoryId"         ) var categoryId         : String? = null,
    @field:Json(name ="currentSortOption"  ) var currentSortOption  : String? = null,
    @field:Json(name ="currentFilters"     ) var currentFilters     : String? = null,
    @field:Json(name ="firstRecNum"        ) var firstRecNum        : Int?    = null,
    @field:Json(name ="lastRecNum"         ) var lastRecNum         : Int?    = null,
    @field:Json(name ="recsPerPage"        ) var recsPerPage        : Int?    = null,
    @field:Json(name ="totalNumRecs"       ) var totalNumRecs       : Int?    = null,
    @field:Json(name ="originalSearchTerm" ) var originalSearchTerm : String? = null,
    @field:Json(name ="plpSellerName"      ) var plpSellerName      : String? = null
)