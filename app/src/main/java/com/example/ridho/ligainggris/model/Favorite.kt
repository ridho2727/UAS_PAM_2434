package com.example.ridho.ligainggris.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Favorite(
        val id: Long?,
        val namaHome: String,
        val namaAway: String,
        val scoreHome: Int,
        val scoreAway: Int,
        val dateEvent: String
) : Parcelable {
    companion object{
        const val TABLE_FAVORIT = "table_favorit"
        const val ID = "id"
        const val NAMAHOME = "namaHome"
        const val NAMAAWAY = "namaAway"
        const val SCOREHOME = "scoreHome"
        const val SCOREAWAY = "scoreAway"
        const val DATEEVENT = "dateEvent"
    }
}