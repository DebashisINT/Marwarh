package com.marwahfoods.features.location.shopRevisitStatus

import com.marwahfoods.base.BaseResponse
import com.marwahfoods.features.location.model.ShopDurationRequest
import com.marwahfoods.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}