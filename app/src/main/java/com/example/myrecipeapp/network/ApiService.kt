package com.example.myrecipeapp.network

import com.example.myrecipeapp.model.CategoriesResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


private val retrofit = Retrofit
    .Builder()
    .baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
val recipeService = retrofit.create(/* service = */ ApiService::class.java)

interface ApiService{
    @GET("categories.php")
    suspend fun getCategories(
    ) : CategoriesResponse

//    private val retrofit: Retrofit
//        get() = Retrofit
//            .Builder()
//            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//    //    .create(ApiService::class.java)
//    val recipeService: ApiService
//        get() = retrofit.create(ApiService::class.java)

}