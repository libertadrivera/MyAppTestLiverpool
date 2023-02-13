package com.example.myapptest.data.remote.service

import android.util.Log
import com.example.myapptest.R
import com.example.myapptest.core.ApiResponseStatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception
import java.net.UnknownHostException

suspend fun <T> callServiceCoordinator(
    call: suspend () -> T
): ApiResponseStatus<T>
        = withContext(Dispatchers.IO){
    try {
        Log.d("TAG_me", "Exito")
        ApiResponseStatus.Success(call())

    } catch (e: Exception){

        Log.d("TAG_me", "Fail1${e.toString()}")
        ApiResponseStatus.Error(R.string.error_data_download)
    } catch (e: UnknownHostException){
        Log.d("TAG_me", "Fail1 ${e.toString()}")
        ApiResponseStatus.Error(R.string.error_no_internet)
    }
}