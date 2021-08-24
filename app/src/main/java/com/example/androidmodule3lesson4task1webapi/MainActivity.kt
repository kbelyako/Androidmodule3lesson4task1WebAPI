package com.example.androidmodule3lesson4task1webapi
/*
ДЗ. Задание 1. Легкое
Подключиться к любому из раннее показанных API и вывести результаты на экран.
Приложение оформить соответствующим образом. Запрос выполняется по нажатию кнопки.
Выводится значок загрузки и т.д.
Дополнение: найти и предложить мне другие прикольные, но простые API,

Простые API для подключения.
1) https://catfact.ninja/fact
2) https://api.coindesk.com/v1/bpi/currentprice.json
3) https://www.boredapi.com/api/activity
4) https://api.zippopotam.us/us/33162

ДЗ. Задание 2. Среднее
Написать программу для вывода текущей стоимости Bitcoin. Все данные красиво вывести на
экран. Добавить кнопку «Refresh data».
https://api.coindesk.com/v1/bpi/currentprice.json
Заметьте, что в GET так и надо прописать путь …v1/bpi/currentprice.json
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidmodule3lesson4task1webapi.network.*
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var baseURL:String="https://www.boredapi.com/api/"
        val sBitCoin:String="1 Bitcoin="
        var descr:String
        var curr:String
        var rate:String
        var rate_float:String
        var sTime:String="Bitcoin rate for"

        baseURL="https://api.coindesk.com/"

      //  baseURL="https://api.zippopotam.us/"

        val retrofit=RetrofitClient().getClient(baseURL).create(API::class.java)
/*
       bt_getRate.setOnClickListener {



        retrofit.getRandomIdea().enqueue(object : retrofit2.Callback<ResponseMain>{
            // retrofit.getRandomIdea().enqueue(object : Callback<ResponseMain>{
            override fun onResponse(call: Call<ResponseMain>, response: Response<ResponseMain>) {
                Log.d("mylog","response")
                Log.d("mylog","response.isSuccessful="+response.isSuccessful)
                Log.d("mylog","response code="+response.code())
                Log.d("mylog","response.message()="+response.message())
                Log.d("mylog","response body="+ (response.body()?.activity))


                tv_rate.text=response.body()?.activity

            }

            override fun onFailure(call: Call<ResponseMain>, t: Throwable) {

                Log.d("mylog","failure, cause="+t.cause)
                Log.d("mylog","failure, message="+t.message)

            }

        })
       }

 */




/*
        retrofit.getRandomIdea().enqueue(object : retrofit2.Callback<ResponseBase>{
            // retrofit.getRandomIdea().enqueue(object : Callback<ResponseUSD>{
            override fun onResponse(call: Call<ResponseBase>, response: Response<ResponseBase>) {
                Log.d("mylog","response")
                Log.d("mylog","response.isSuccessful="+response.isSuccessful)
                Log.d("mylog","response code="+response.code())
                Log.d("mylog","response.message()="+response.message())
                Log.d("mylog","response body="+ (response.body()?.disclaimer))


                tv_rate.text=response.body()?.disclaimer

            }

            override fun onFailure(call: Call<ResponseBase>, t: Throwable) {

                Log.d("mylog","failure")
               // Log.d("mylog","response code="+response.code())

            }

        })



 */


        bt_getRate.setOnClickListener {
            retrofit.getRandomIdea().enqueue(object : retrofit2.Callback<BitCoinMainJSON>{
                // retrofit.getRandomIdea().enqueue(object : Callback<ResponseUSD>{
                override fun onResponse(call: Call<BitCoinMainJSON>, response: Response<BitCoinMainJSON>) {
                    Log.d("mylog","response")
                    Log.d("mylog","response.isSuccessful="+response.isSuccessful)
                    Log.d("mylog","response code="+response.code())
                    Log.d("mylog","response.message()="+response.message())
                    Log.d("mylog","response body="+ (response.body()?.bpi))


                    descr=response.body()?.bpi?.uSD?.description.toString()
                    curr=response.body()?.bpi?.uSD?.code.toString()
                    rate=response.body()?.bpi?.uSD?.rate.toString()
                    rate_float=response.body()?.bpi?.uSD?.rate_float.toString()
                    tv_BitCoin_USD_rate.text=descr+"\n"+sBitCoin+rate+" "+curr//+"\n"+"rate float="+rate_float

                    tv_Time.text= sTime+"\n"+response.body()?.time?.updated.toString()

                    tv_BitCoin_USD_rate.text=response.body()?.bpi?.uSD?.description.toString()+"\n"+
                            sBitCoin+response.body()?.bpi?.uSD?.rate.toString()+" "+response.body()?.bpi?.uSD?.code.toString()

                    tv_BitCoin_EUR_rate.text=response.body()?.bpi?.eUR?.description.toString()+"\n"+
                            sBitCoin+response.body()?.bpi?.eUR?.rate.toString()+" "+response.body()?.bpi?.eUR?.code.toString()

                    tv_BitCoin_GBP_rate.text=response.body()?.bpi?.gBP?.description.toString()+"\n"+
                            sBitCoin+response.body()?.bpi?.gBP?.rate.toString()+" "+response.body()?.bpi?.gBP?.code.toString()

                }

                override fun onFailure(call: Call<BitCoinMainJSON>, t: Throwable) {


                    Log.d("mylog","failure")

                    Log.d("mylog","failure, cause="+t.cause)
                    Log.d("mylog","failure, message="+t.message)
                }

            })

        }

/*
        retrofit.getRandomIdea().enqueue(object : retrofit2.Callback<Json4Kotlin_Base>{
            // retrofit.getRandomIdea().enqueue(object : Callback<ResponseUSD>{
            override fun onResponse(call: Call<Json4Kotlin_Base>, response: Response<Json4Kotlin_Base>) {
                Log.d("mylog","response")
                Log.d("mylog","response.isSuccessful="+response.isSuccessful)
                Log.d("mylog","response code="+response.code())
                Log.d("mylog","response.message()="+response.message())
                Log.d("mylog","response body="+ (response.body()?.sCountry))


                tv_rate.text=response.body()?.sCountry

            }

            override fun onFailure(call: Call<Json4Kotlin_Base>, t: Throwable) {

                Log.d("mylog","failure")

                Log.d("mylog","failure, cause="+t.cause)
                Log.d("mylog","failure, message="+t.message)

            }

        })

 */









    }
}