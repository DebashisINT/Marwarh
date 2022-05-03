package com.marwarhfoods.features.stockAddCurrentStock.api

import com.marwarhfoods.base.BaseResponse
import com.marwarhfoods.features.location.model.ShopRevisitStatusRequest
import com.marwarhfoods.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.marwarhfoods.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.marwarhfoods.features.stockAddCurrentStock.model.CurrentStockGetData
import com.marwarhfoods.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}