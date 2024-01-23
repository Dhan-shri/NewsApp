package com.dhanshri.newsapp.repo

import com.dhanshri.newsapp.data.datasource.NewsDataSource
import com.dhanshri.newsapp.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject


// Here we fetch the data from the api and pass it to the viewmodel or other datasources

class NewsRepository @Inject constructor(
    private val newsDataSource: NewsDataSource
){

    suspend fun getNewsHeadlines(country : String) : Response<NewsResponse> {
       return newsDataSource.getNewsHeadlines(country)
    }
}