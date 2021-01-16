package com.example.ridho.ligainggris.model

import io.reactivex.Flowable

interface PertandinganInterface {

    fun getYangLalu(id : String) : Flowable<PertandingantResponse>

    fun getTim(id : String = "0") : Flowable<TimBolaResponse>

    fun getYangAkanDatang(id : String) : Flowable<PertandingantResponse>

}