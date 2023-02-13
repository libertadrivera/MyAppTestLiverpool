package com.example.myapptest.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapptest.presentation.ui.theme.MyAppTestTheme

class RecordsActivity : ComponentActivity() {
    private val viewModel: RecordsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTestTheme {
                val recordsList = viewModel.recordsList

                Log.d("TAG_activity", "recordsList ${recordsList.value}")

                RecordsScreen(recordsList.value)
            }
        }
    }
}

@Composable
fun me(){
    Text("Hola mundo!")
}

