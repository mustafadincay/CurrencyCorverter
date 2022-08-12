package com.mustafadincay.currencycorverter.main

import com.mustafadincay.currencycorverter.data.model.CurrencyResponse
import com.mustafadincay.currencycorverter.util.Resource

interface MainRepository {
    suspend fun getRates(base: String, key: String): Resource<CurrencyResponse>
}