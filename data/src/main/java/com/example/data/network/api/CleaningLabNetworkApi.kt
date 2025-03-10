package com.example.data.network.api

import com.example.data.network.response.RandomDisplayTextResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CleaningLabNetworkApi {

    @GET("$API_V1/home/display/{id}")
    suspend fun getRandomDisplayText(
        @Path("id") id: Int
    ): Response<RandomDisplayTextResponse>

    companion object {
        private const val API_V1 = "/api/v1"
    }
}