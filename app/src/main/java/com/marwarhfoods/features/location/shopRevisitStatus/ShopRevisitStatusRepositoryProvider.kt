package com.marwarhfoods.features.location.shopRevisitStatus

import com.marwarhfoods.features.location.shopdurationapi.ShopDurationApi
import com.marwarhfoods.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}