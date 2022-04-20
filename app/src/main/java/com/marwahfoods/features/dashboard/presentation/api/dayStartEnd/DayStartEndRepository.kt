package com.marwahfoods.features.dashboard.presentation.api.dayStartEnd

import com.marwahfoods.app.Pref
import com.marwahfoods.base.BaseResponse
import com.marwahfoods.features.dashboard.presentation.model.DaystartDayendRequest
import com.marwahfoods.features.dashboard.presentation.model.StatusDayStartEnd
import com.marwahfoods.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.marwahfoods.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}