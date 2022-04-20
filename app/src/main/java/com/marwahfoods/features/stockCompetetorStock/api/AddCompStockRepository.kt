package com.marwahfoods.features.stockCompetetorStock.api

import com.marwahfoods.base.BaseResponse
import com.marwahfoods.features.orderList.model.NewOrderListResponseModel
import com.marwahfoods.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.marwahfoods.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}