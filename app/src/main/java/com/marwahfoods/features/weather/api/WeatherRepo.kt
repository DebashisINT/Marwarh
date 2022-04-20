package com.marwahfoods.features.weather.api

import com.marwahfoods.base.BaseResponse
import com.marwahfoods.features.task.api.TaskApi
import com.marwahfoods.features.task.model.AddTaskInputModel
import com.marwahfoods.features.weather.model.ForeCastAPIResponse
import com.marwahfoods.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}