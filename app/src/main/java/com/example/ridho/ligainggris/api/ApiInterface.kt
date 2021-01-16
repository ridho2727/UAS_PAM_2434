package com.example.ridho.ligainggris.api

import com.example.ridho.ligainggris.model.PertandingantResponse
import com.example.ridho.ligainggris.model.TimBolaResponse
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("eventspastleague.php")
    fun getYangLalu(@Query("id") id:String) : Flowable<PertandingantResponse>

    @GET("eventsnextleague.php")
    fun getYangAkanDatang(@Query("id") id:String) : Flowable<PertandingantResponse>

    @GET("lookupteam.php")
    fun getTim(@Query("id") id:String) : Flowable<TimBolaResponse>
}