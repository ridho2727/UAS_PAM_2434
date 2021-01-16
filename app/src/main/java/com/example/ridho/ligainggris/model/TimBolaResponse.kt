package com.example.ridho.ligainggris.model

import com.google.gson.annotations.SerializedName

data class TimBolaResponse(
        @SerializedName("teams")
        var timBolas: List<TimBola>)