package com.example.androidmodule3lesson4task1webapi.network

import com.google.gson.annotations.SerializedName

data class BitCoinMainJSON (

	@SerializedName("time") val time : Time,
	@SerializedName("disclaimer") val disclaimer : String,
	@SerializedName("chartName") val chartName : String,
	@SerializedName("bpi") val bpi : Bpi
)