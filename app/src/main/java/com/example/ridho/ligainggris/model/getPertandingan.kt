package com.example.ridho.ligainggris.model

import com.example.ridho.ligainggris.api.ApiInterface
import io.reactivex.Flowable

class getPertandingan(private val apiInterface: ApiInterface) : PertandinganInterface {

    override fun getYangAkanDatang(id: String): Flowable<PertandingantResponse> = apiInterface.getYangAkanDatang(id)

    override fun getYangLalu(id: String): Flowable<PertandingantResponse> = apiInterface.getYangLalu(id)

    override fun getTim(id: String): Flowable<TimBolaResponse> = apiInterface.getTim(id)
}