package com.marwahfoods.features.stockAddCurrentStock.api

import com.marwahfoods.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.marwahfoods.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}