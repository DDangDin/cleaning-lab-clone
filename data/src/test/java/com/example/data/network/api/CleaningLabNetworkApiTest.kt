package com.example.data.network.api

import com.example.data.network.api.testdoubles.RandomDisplayTextTestData
import com.example.data.network.api.util.setBody
import com.example.data.network.api.util.setResponseCode
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.net.ssl.HttpsURLConnection

@ExperimentalCoroutinesApi
@RunWith(JUnit4::class)
class CleaningLabNetworkApiTest {
    private val mockWebServer = MockWebServer()
    private lateinit var moshi: Moshi
    private lateinit var networkApi: CleaningLabNetworkApi

    @Before
    fun setUp() {
        mockWebServer.start()
        moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
        networkApi = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl(mockWebServer.url("/"))
            .build()
            .create(CleaningLabNetworkApi::class.java)
    }

    @After
    fun teardown() {
        mockWebServer.close()
    }

    @Test
    fun `getRandomDisplayText() 호출 성공 테스트`() = runTest {
        // Given
        mockWebServer.setBody { RandomDisplayTextTestData.responseJson }

        // When
        val response = networkApi.getRandomDisplayText(1)

        // Then
        assert(response.isSuccessful)
        assertEquals(response.body()!!, RandomDisplayTextTestData.responseData)
    }

    @Test
    fun `getRandomDisplayText() 호출 실패(404) 테스트`() = runTest {
        // Given
        mockWebServer.setResponseCode { NOT_FOUND_404 }

        // When
        val response = networkApi.getRandomDisplayText(1)

        // Then
        assertFalse(response.isSuccessful)
        assertEquals(response.code(), NOT_FOUND_404)
    }

    companion object {
        private const val NOT_FOUND_404 = HttpsURLConnection.HTTP_NOT_FOUND
    }
}