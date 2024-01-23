package com.dhanshri.newsapp.data.datasource

import com.dhanshri.newsapp.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsDataSource {
    suspend fun getNewsHeadlines(country: String ) : Response<NewsResponse>


}