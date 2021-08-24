package com.example.androidmodule3lesson4task1webapi.network

import com.google.gson.annotations.SerializedName

data class ResponseTime (

    @SerializedName("updated") val updated : String,
    @SerializedName("updatedISO") val updatedISO : String,
    @SerializedName("updateduk") val updateduk : String
)