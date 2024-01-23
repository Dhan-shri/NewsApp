package com.dhanshri.newsapp.data.networkapi

import com.dhanshri.newsapp.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadlines(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "d63c367aecf14702ad0c04742386f5f7"
    ) : Response<NewsResponse>


}



//https://newsapi.org/v2/top-headlines?country=us&apiKey=d63c367aecf14702ad0c04742386f5f7
//https://newsapi.org/v2/everything?q=bitcoin&apiKey=d63c367aecf14702ad0c04742386f5f7