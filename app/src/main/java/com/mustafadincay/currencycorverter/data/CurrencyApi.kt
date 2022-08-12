package com.mustafadincay.currencycorverter.data

import com.mustafadincay.currencycorverter.data.model.CurrencyResponse
import com.mustafadincay.currencycorverter.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    @GET("/latest")
    suspend fun getRates(
        @Query("base") base: String,
        @Query("key") key: String = Constants.API_KEY
    ): Response<CurrencyResponse>
}