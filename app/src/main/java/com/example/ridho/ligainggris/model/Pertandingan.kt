package com.example.ridho.ligainggris.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pertandingan(

        @SerializedName("strEvent") var strEvent: String?,
        @SerializedName("strTime") var strTime: String?,
        @SerializedName("strHomeTeam") var strHomeTeam: String?,
        @SerializedName("strAwayTeam") var strAwayTeam: String?,
        @SerializedName("strVenue") var strVenue: String?,
        @SerializedName("dateEvent") var dateEvent: String?,
        @SerializedName("strThumb") var strThumb: String?,
        @SerializedName("idAwayTeam") var idAwayTeam: String,
        @SerializedName("idEvent") var idEvent: String?,
        @SerializedName("idHomeTeam") var idHomeTeam: String,
        @SerializedName("idLeague") var idLeague: String?,
        @SerializedName("intAwayScore") var intAwayScore: String?,
        @SerializedName("intHomeScore") var intHomeScore: String?,
        @SerializedName("strStatus") var strStatus: String?


) : Parcelable
