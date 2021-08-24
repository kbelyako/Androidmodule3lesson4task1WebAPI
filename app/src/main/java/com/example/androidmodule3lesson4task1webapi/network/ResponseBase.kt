package com.example.androidmodule3lesson4task1webapi.network

import com.google.gson.annotations.SerializedName
import java.sql.Time

data class ResponseBase (

    @SerializedName("time") val time : String,
    @SerializedName("disclaimer") val disclaimer : String,
    @SerializedName("chartName") val chartName : String,
    @SerializedName("bpi") val bpi : String
)