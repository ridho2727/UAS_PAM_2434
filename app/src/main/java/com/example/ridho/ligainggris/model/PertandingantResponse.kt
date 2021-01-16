package com.example.ridho.ligainggris.model

import com.google.gson.annotations.SerializedName

data class PertandingantResponse (
        @SerializedName("events") var events: List<Pertandingan>)
