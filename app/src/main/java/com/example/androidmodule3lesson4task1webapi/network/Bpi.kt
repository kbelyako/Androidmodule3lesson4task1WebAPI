package com.example.androidmodule3lesson4task1webapi.network

import com.google.gson.annotations.SerializedName


data class Bpi (

	@SerializedName("USD") val uSD : USD,
	@SerializedName("GBP") val gBP : GBP,
	@SerializedName("EUR") val eUR : EUR
)