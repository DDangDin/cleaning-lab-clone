package com.example.data.network.api.testdoubles

import com.example.data.network.response.RandomDisplayTextResponse

object RandomDisplayTextTestData {
    private const val CONTENT = "test content"
    val responseData = RandomDisplayTextResponse(CONTENT)
    val responseJson = """
        {
            "content":"$CONTENT"
        }
    """.trimIndent()
}