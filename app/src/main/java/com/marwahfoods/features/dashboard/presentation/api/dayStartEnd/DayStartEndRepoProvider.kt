package com.marwahfoods.features.dashboard.presentation.api.dayStartEnd

import com.marwahfoods.features.stockCompetetorStock.api.AddCompStockApi
import com.marwahfoods.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}