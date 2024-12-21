package com.example.jetpackcompose.ui.views

import retrofit2.http.GET



data class ForecastItem(
    val main: Main,
    val weather: List<Weather>,
    val dtTxt: String
)

data class Main(
    val temp: Double
)

data class Weather(
    val description: String,
    val icon: String
)
