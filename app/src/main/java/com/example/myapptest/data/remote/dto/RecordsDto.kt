package com.example.myapptest.data.remote.dto

import com.squareup.moshi.Json

data class RecordsDto(
    @field:Json(name ="productId"              ) var productId              : String?                  = null,
    @field:Json(name ="skuRepositoryId"        ) var skuRepositoryId        : String?                  = null,
    @field:Json(name ="productDisplayName"     ) var productDisplayName     : String?                  = null,
    @field:Json(name ="productType"            ) var productType            : String?                  = null,
    @field:Json(name ="productRatingCount"     ) var productRatingCount     : Int?                     = null,
    @field:Json(name ="productAvgRating"       ) var productAvgRating       : Float?                     = null,
    @field:Json(name ="promotionalGiftMessage" ) var promotionalGiftMessage : String?                  = null,
    @field:Json(name ="listPrice"              ) var listPrice              : Float?                     = null,
    @field:Json(name ="minimumListPrice"       ) var minimumListPrice       : Float?                     = null,
    @field:Json(name ="maximumListPrice"       ) var maximumListPrice       : Float?                     = null,
    @field:Json(name ="promoPrice"             ) var promoPrice             : Float?                     = null,
    @field:Json(name ="minimumPromoPrice"      ) var minimumPromoPrice      : Float?                     = null,
    @field:Json(name ="maximumPromoPrice"      ) var maximumPromoPrice      : Float?                     = null,
    @field:Json(name ="isHybrid"               ) var isHybrid               : Boolean?                 = null,
    @field:Json(name ="isMarketPlace"          ) var isMarketPlace          : Boolean?                 = null,
    @field:Json(name ="isImportationProduct"   ) var isImportationProduct   : Boolean?                 = null,
    @field:Json(name ="brand"                  ) var brand                  : String?                  = null,
    @field:Json(name ="seller"                 ) var seller                 : String?                  = null,
    @field:Json(name ="category"               ) var category               : String?                  = null,
    @field:Json(name ="dwPromotionInfo"        ) var dwPromotionInfo        : DwPromotionInfoDto?         = DwPromotionInfoDto(),
    @field:Json(name ="isExpressFavoriteStore" ) var isExpressFavoriteStore : Boolean?                 = null,
    @field:Json(name ="isExpressNearByStore"   ) var isExpressNearByStore   : Boolean?                 = null,
    @field:Json(name ="smImage"                ) var smImage                : String?                  = null,
    @field:Json(name ="lgImage"                ) var lgImage                : String?                  = null,
    @field:Json(name ="xlImage"                ) var xlImage                : String?                  = null,
    @field:Json(name ="groupType"              ) var groupType              : String?                  = null,
    @field:Json(name ="plpFlags"               ) var plpFlags               : List<String>? = null,
    @field:Json(name ="variantsColor"          ) var variantsColor          : List<VariantsColorDto>? = null
)
