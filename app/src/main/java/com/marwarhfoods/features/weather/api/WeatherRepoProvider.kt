package com.marwarhfoods.features.weather.api

import com.marwarhfoods.features.task.api.TaskApi
import com.marwarhfoods.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}