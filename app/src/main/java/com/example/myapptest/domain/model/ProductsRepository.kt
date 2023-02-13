package com.example.myapptest.domain.model

import android.util.Log
import com.example.myapptest.core.ApiResponseStatus
import com.example.myapptest.data.mapper.ProductDtoMapper
import com.example.myapptest.data.remote.dto.ProductListResponseDto
import com.example.myapptest.data.remote.dto.RecordsDto
import com.example.myapptest.data.remote.service.ProductsApi.retrofitService
import com.example.myapptest.data.remote.service.callServiceCoordinator

class ProductsRepository {
    suspend fun getAllRecords(): ApiResponseStatus<List<Records>?>

      =   callServiceCoordinator {
            val recordsListApiResponse = retrofitService.getAllProducts()

            val recordsDtoList = recordsListApiResponse.plpResults?.records!!

            val recordsDtoMapper = ProductDtoMapper()
         recordsDtoMapper.fromRrecordsDtoLisToRecordsDomianList(recordsDtoList)

        }

    }


