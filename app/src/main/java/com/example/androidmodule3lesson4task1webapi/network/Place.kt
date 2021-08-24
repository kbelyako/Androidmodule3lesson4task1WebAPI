package com.example.androidmodule3lesson4task1webapi.network

import com.google.gson.annotations.SerializedName

data class Place (

    @SerializedName("place name") val placeName : String,
    @SerializedName("longitude") val longitude : Double,
    @SerializedName("state") val state : String,
    @SerializedName("state abbreviation") val stateAbbreviation : String,
    @SerializedName("latitude") val latitude : Double
)