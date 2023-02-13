package com.example.myapptest.data.remote.service

import com.example.myapptest.core.Parameter.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private val retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create())
    .build()

object ProductsApi{
    val retrofitService: ProductService by lazy{
        retrofit.create(ProductService::class.java)
    }
}