package com.marwarhfoods.features.dashboard.presentation.api.dayStartEnd

import com.marwarhfoods.app.Pref
import com.marwarhfoods.base.BaseResponse
import com.marwarhfoods.features.dashboard.presentation.model.DaystartDayendRequest
import com.marwarhfoods.features.dashboard.presentation.model.StatusDayStartEnd
import com.marwarhfoods.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.marwarhfoods.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}