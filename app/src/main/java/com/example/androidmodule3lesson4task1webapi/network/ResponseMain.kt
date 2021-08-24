package com.example.androidmodule3lesson4task1webapi.network

import com.google.gson.annotations.SerializedName

class ResponseMain (
    @SerializedName("activity") val activity:String,
    @SerializedName("type") val type:String,
    @SerializedName("participants") val participants:String,
    @SerializedName("price") val price:String,
    @SerializedName("link") val link:String,
    @SerializedName("key") val key:String,
    @SerializedName("accessibility") val accessibility:String
    )