package com.example.myapptest.core

sealed class ApiResponseStatus<T>(
    val data: T? = null,
    val message: Int = 0,
    val loading: Boolean? = null
) {
    class Success<T>(data: T? = null) : ApiResponseStatus<T>(data = data)
    class Error<T>( message: Int = 0) : ApiResponseStatus<T>( message = message)
    class Loading<T>(loading: Boolean? = null) : ApiResponseStatus<T>(loading = loading)

}

