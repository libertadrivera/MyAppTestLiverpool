package com.example.myapptest.domain.model

import android.os.Parcelable
import com.example.myapptest.data.remote.dto.VariantsColorDto
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Records(
    var productDisplayName     : String?                  = null,
    var listPrice              : Float?                     = null,
    var promoPrice             : Float?                     = null,
    var smImage                : String?                  = null,
    var lgImage                : String?                  = null,
    var xlImage                : String?                  = null
  // var variantsColor          : MutableList<VariantsColorDto>? = null
): Parcelable
