package com.dhanshri.newsapp.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.dhanshri.newsapp.viewmodel.NewsViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun HomeScreen(
    // Create instance of viewmode in screen
    // to use the HiltViewmodel annotation we need to at least one parameter in viewmodel contrustor
    newsViewModel: NewsViewModel = hiltViewModel()
) {
    Surface (
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "Home Screen")
    }
}

// Create instance of viewmode in screen
@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}