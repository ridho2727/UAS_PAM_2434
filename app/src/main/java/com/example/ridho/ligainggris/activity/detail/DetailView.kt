package com.example.ridho.ligainggris.activity.detail

import com.example.ridho.ligainggris.model.Pertandingan
import com.example.ridho.ligainggris.model.TimBola

interface DetailView {

    interface View{
        fun displayBadgeLiga(liga: Pertandingan)
        fun displayTeamBadgeHome(timBola: TimBola)
        fun displayTeamBadgeAway(timBola: TimBola)
    }

    interface Presenter{
        fun getBadgeLiga(id:String)
        fun getTeamsBadgeAway(id:String)
        fun getTeamsBadgeHome(id:String)
    }
}