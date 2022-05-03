package com.marwarhfoods.features.dashboard.presentation.api.dayStartEnd

import com.marwarhfoods.features.stockCompetetorStock.api.AddCompStockApi
import com.marwarhfoods.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}