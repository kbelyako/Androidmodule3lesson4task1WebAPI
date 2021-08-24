package com.example.androidmodule3lesson4task1webapi.network


import retrofit2.Call
import retrofit2.http.GET

interface API {
    @GET("v1/bpi/currentprice.json")
 //   @GET("activity")
  //@GET("us/33162")
   // fun getRandomIdea():Call<ResponseMain>
  //  fun getRandomIdea():Call<ResponseUSD>
  //  fun getRandomIdea():Call<ResponseTime>
   // fun getRandomIdea():Call<ResponseBase>
   // fun getRandomIdea():Call<Json4Kotlin_Base>

  fun getRandomIdea():Call<BitCoinMainJSON>
}