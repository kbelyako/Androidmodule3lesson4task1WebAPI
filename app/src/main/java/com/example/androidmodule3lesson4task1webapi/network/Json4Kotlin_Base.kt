package com.example.androidmodule3lesson4task1webapi.network

import com.google.gson.annotations.SerializedName

data class Json4Kotlin_Base (

    @SerializedName("post code") val postCode : Int,
    @SerializedName("country") val sCountry : String,
    @SerializedName("country abbreviation") val countryAbbreviation : String,
    @SerializedName("places") val places : List<Place>
)