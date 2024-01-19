package com.dhanshri.newsapp.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(): ViewModel() {

    init {
        Log.d(TAG, "NewsViewModel: Entering into init !!")
    }

    companion object {
        private const val TAG = "NewsViewModel"
    }
}