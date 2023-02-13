package com.example.myapptest.data.mapper

import com.example.myapptest.data.remote.dto.RecordsDto
import com.example.myapptest.domain.model.Records

class ProductDtoMapper {

    private fun fromRecordsDtoToRecordsDomain(recordsDto: RecordsDto):Records {
        return Records(
            lgImage = recordsDto.lgImage,
            productDisplayName = recordsDto.productDisplayName,
            listPrice = recordsDto.listPrice,
            promoPrice = recordsDto.promoPrice
        )
    }
     fun fromRrecordsDtoLisToRecordsDomianList(recordsDtoList: List<RecordsDto>): List<Records>{
            return recordsDtoList.map { fromRecordsDtoToRecordsDomain(it) }
     }

}