package com.example.androidmodule3lesson4task1webapi.network

import android.util.Log
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    private var retrofit: Retrofit? = null

    fun getClient(baseUrl:String):Retrofit{
        if(retrofit==null) {
            Log.d("mylog","retrofit==null")
            Log.d("mylog","baseUrl="+baseUrl)

            retrofit=Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }
    }
