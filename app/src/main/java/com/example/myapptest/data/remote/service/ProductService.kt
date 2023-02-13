package com.example.myapptest.data.remote.service

import com.example.myapptest.data.remote.dto.ProductListResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ProductService {
    @GET("plp")

    suspend fun getAllProducts(
        @Query("search-string") search_string: String?=null,
        @Query("page-number") page_number: Int?=null
    ): ProductListResponseDto
}