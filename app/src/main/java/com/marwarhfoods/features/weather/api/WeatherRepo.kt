package com.marwarhfoods.features.weather.api

import com.marwarhfoods.base.BaseResponse
import com.marwarhfoods.features.task.api.TaskApi
import com.marwarhfoods.features.task.model.AddTaskInputModel
import com.marwarhfoods.features.weather.model.ForeCastAPIResponse
import com.marwarhfoods.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}