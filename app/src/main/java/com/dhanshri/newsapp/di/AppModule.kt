package com.dhanshri.newsapp.di

import com.dhanshri.newsapp.data.AppConstants
import com.dhanshri.newsapp.data.datasource.NewsDataSource
import com.dhanshri.newsapp.data.datasource.NewsDataSourceImpl
import com.dhanshri.newsapp.data.networkapi.ApiService
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton
import kotlin.jvm.internal.Intrinsics.Kotlin


// dependency injection layer
// we will use hilt for dependency injection
//dagger module we use module to define the third party dependencies/ module we want these dependencies to entire proejct
@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton  // This means that we want to create only one instance of this retrofit object
    fun provideRetrofit() : Retrofit {
        val httpLoggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY

            // we can use this interceptor to log the request and response
        }

        val httpClient = OkHttpClient().newBuilder().apply {
            addInterceptor(httpLoggingInterceptor)
        }

        httpClient.apply {
            // This means that if the request is not completed in 60 seconds then it will throw an exception
            readTimeout(60, TimeUnit.SECONDS)
        }

        val moshi = Moshi.Builder()
            .add(JsonAdapter.Factory::class.java).build()

        return Retrofit.Builder()
            .baseUrl(AppConstants.APP_BASE_URL)
            .client(httpClient.build())
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
//        return Retrofit.Builder().
//            .baseUrl("https://newsapi.org/")
//            .build()
    }


    // dependency for apiService class

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit) : ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideNewsDataSource(apiService: ApiService) : NewsDataSource {
        return NewsDataSourceImpl(apiService)
    }
}