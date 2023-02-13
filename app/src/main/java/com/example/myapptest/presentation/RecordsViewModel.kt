package com.example.myapptest.presentation

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapptest.core.ApiResponseStatus
import com.example.myapptest.domain.model.ProductsRepository
import com.example.myapptest.domain.model.Records
import kotlinx.coroutines.launch

class RecordsViewModel  : ViewModel(){

    var recordsList = mutableStateOf<List<Records>>(listOf())
        private set

    var status = mutableStateOf<ApiResponseStatus<Any>?>(null)
        private set

    private val recordsRepository = ProductsRepository()
    init{
        getAllRecords()
    }

    private fun getAllRecords() {
        viewModelScope.launch{
            status.value = ApiResponseStatus.Loading()
            val resp = recordsRepository.getAllRecords()
            Log.d("TAG_me viewModel", "${resp.data}")
           // handleResponseStatus()
        }
    }

    private fun handleResponseStatus(apiResponseStatus: ApiResponseStatus<List<Records>?>) {
        if(apiResponseStatus is ApiResponseStatus.Success){
            recordsList.value = apiResponseStatus.data!!
        }

        status.value = apiResponseStatus as ApiResponseStatus<Any>
    }


  }

