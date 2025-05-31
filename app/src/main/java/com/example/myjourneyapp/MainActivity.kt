package com.example.myjourneyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myjourneyapp.base.BaseActivity
import com.example.myjourneyapp.ui.theme.MyJourneyAppTheme

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyJourneyAppTheme {
                BuildContent()
            }
        }
    }

    @Composable
    override fun BuildContent() {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            ShowCountViewScreen(innerPadding)
        }
    }
}

@Composable
fun ShowCountViewScreen(
    paddingValues: PaddingValues
){
    var counter by remember { mutableIntStateOf(0) }
    Row(modifier = Modifier.padding(paddingValues),
        verticalAlignment = Alignment.CenterVertically){
        Button(modifier = Modifier, onClick = {
            counter++
        }) {
            Text("click count")
        }

        Text(
            text = counter.toString(),
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}