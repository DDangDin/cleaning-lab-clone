package com.example.data.network.api.util

import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer

fun MockWebServer.setBody(body: () -> String) {
    this.enqueue(MockResponse().apply {
        setBody(body())
    })
}

fun MockWebServer.setResponseCode(code: () -> Int) {
    this.enqueue(MockResponse().apply {
        setResponseCode(code())
    })
}