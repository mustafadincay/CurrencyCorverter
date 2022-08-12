package com.mustafadincay.currencycorverter.main

import com.mustafadincay.currencycorverter.data.CurrencyApi
import com.mustafadincay.currencycorverter.data.model.CurrencyResponse
import com.mustafadincay.currencycorverter.util.Resource
import java.lang.Exception
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private val api: CurrencyApi
) : MainRepository {
    override suspend fun getRates(base: String, key: String): Resource<CurrencyResponse> {
        return try {
            val response = api.getRates(base, key)
            val result = response.body()
            if(response.isSuccessful && result != null) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Error")
        }
    }

}