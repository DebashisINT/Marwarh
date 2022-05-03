package com.marwarhfoods.features.stockAddCurrentStock.api

import com.marwarhfoods.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.marwarhfoods.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}