package com.example.androidmodule3lesson4task1webapi.network

import com.google.gson.annotations.SerializedName

data class ResponseUSD (

    @SerializedName("code") val code : String,
    @SerializedName("symbol") val symbol : String,
    @SerializedName("rate") val rate : String,
    @SerializedName("description") val description : String,
    @SerializedName("rate_float") val rate_float : Double
    )
