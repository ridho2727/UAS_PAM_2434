package com.example.ridho.ligainggris.activity.main

import com.example.ridho.ligainggris.model.Pertandingan

interface MainView {

    interface View{
        fun hideLoading()
        fun showLoading()
        fun displayFootballMatch(matchList:List<Pertandingan>)
    }

    interface Presenter{
        fun getYangLalu()

        fun getYangAkanDatang()

        fun getFavoriteData()
    }

}