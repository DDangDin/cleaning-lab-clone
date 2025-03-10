package com.example.data.network.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RandomDisplayTextResponse(
    val content: String
)
