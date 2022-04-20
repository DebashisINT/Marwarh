package com.marwahfoods.features.weather.api

import com.marwahfoods.features.task.api.TaskApi
import com.marwahfoods.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}