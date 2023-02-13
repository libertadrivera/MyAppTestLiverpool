package com.example.myapptest.presentation

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card

import androidx.compose.material.Scaffold

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.myapptest.domain.model.Records

@Composable
fun RecordsScreen(recordsList : List<Records>) {
    Scaffold(
        topBar = { RecordsListScreenTopBar() }
    ) {
        LazyColumn {
            items(recordsList) {
                RecordItem(record = it)
            }
        }
    }
}

@Composable
fun RecordItem(record: Records){
    Card(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 10.dp)
            .height(116.dp)
            .fillMaxWidth()
            .border(1.dp, Color(0xffeaeaea), shape = RoundedCornerShape(12.dp)),
        elevation = 1.dp,
        shape = RoundedCornerShape(12.dp),
        backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 16.dp,
                    top = 32.dp,
                    end = 16.dp,
                    bottom = 16.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                modifier = Modifier
                    .width(270.dp)
                    .padding(top = 80.dp),

                painter = rememberImagePainter(record.xlImage),
                contentDescription = record.productDisplayName
                ,contentScale = ContentScale.Fit

            )
            Text(
                text = record.productDisplayName?:"",
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = record.listPrice.toString(),
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = record.promoPrice.toString(),
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.Medium
            )

        }
    }
}
@Composable
fun RecordsListScreenTopBar(){
    TopAppBar(
        title = {
            Text("Productos")
        },

        backgroundColor = colorResource(id = R.color.white),
        contentColor = Color.Black,
        elevation = 0.dp

    )
}
