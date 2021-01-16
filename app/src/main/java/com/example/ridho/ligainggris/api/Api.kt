package com.example.ridho.ligainggris.api

import com.example.ridho.ligainggris.BuildConfig
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class Api {

    companion object {
        fun getClient(): Retrofit {
            return Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_URL +
                            "api/v1/json/${BuildConfig.TSDB_API_KEY}")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
        }
    }
}