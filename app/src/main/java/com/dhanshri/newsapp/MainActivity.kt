package com.dhanshri.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.dhanshri.newsapp.navigation.AppNavigationGraph
import com.dhanshri.newsapp.ui.theme.NewsAppTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint  // This annotation tells Hilt that this is the entry point for the app.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                ) {
                    NewsAppEntryPoint()
                }
            }
        }
    }
}



@Composable
fun NewsAppEntryPoint(){
    AppNavigationGraph()
}