package com.marwahfoods.features.location.shopRevisitStatus

import com.marwahfoods.features.location.shopdurationapi.ShopDurationApi
import com.marwahfoods.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}