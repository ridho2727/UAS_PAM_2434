package com.example.ridho.ligainggris.model

import com.google.gson.annotations.SerializedName


data class TimBola(

        @SerializedName("idLeague")
        var idLeague: String,
        @SerializedName("idSoccerXML")
        var idSoccerXML: String,
        @SerializedName("idTeam")
        var idTeam: String,
        @SerializedName("strTeamLogo")
        var strTeamLogo: String,
        @SerializedName("strTeamShort")
        var strTeamShort: String,
        @SerializedName("strSport")
        var strSport: String,
        @SerializedName("strStadium")
        var strStadium: String,
        @SerializedName("strTeam")
        var strTeam: String,
        @SerializedName("strTeamBadge")
        var strTeamBadge: String

)
