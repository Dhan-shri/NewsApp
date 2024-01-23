package com.dhanshri.newsapp.data.datasource

import com.dhanshri.newsapp.data.entity.NewsResponse
import com.dhanshri.newsapp.data.networkapi.ApiService
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : NewsDataSource {


    override fun getNewsHeadlines(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadlines(country)
    }
}