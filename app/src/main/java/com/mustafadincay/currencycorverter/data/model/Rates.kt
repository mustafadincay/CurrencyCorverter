package com.mustafadincay.currencycorverter.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Rates(
    @SerializedName("CAD")
    val CAD: Double,
    @SerializedName("CNY")
    val CNY: Double,
    @SerializedName("EUR")
    val EUR: Double,
    @SerializedName("GBP")
    val GBP: Double,
    @SerializedName("JPY")
    val JPY: Double,
    @SerializedName("TRY")
    val TRY: Double,
    @SerializedName("USD")
    val USD: Double,
): Serializable