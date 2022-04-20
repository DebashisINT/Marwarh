package com.marwahfoods.features.stockAddCurrentStock.api

import com.marwahfoods.base.BaseResponse
import com.marwahfoods.features.location.model.ShopRevisitStatusRequest
import com.marwahfoods.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.marwahfoods.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.marwahfoods.features.stockAddCurrentStock.model.CurrentStockGetData
import com.marwahfoods.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}