package com.marwarhfoods.features.location.shopRevisitStatus

import com.marwarhfoods.base.BaseResponse
import com.marwarhfoods.features.location.model.ShopDurationRequest
import com.marwarhfoods.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}