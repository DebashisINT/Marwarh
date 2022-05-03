package com.marwarhfoods.features.location.api

import com.marwarhfoods.app.Pref
import com.marwarhfoods.base.BaseResponse
import com.marwarhfoods.features.location.model.AppInfoInputModel
import com.marwarhfoods.features.location.model.AppInfoResponseModel
import com.marwarhfoods.features.location.model.ShopDurationRequest
import com.marwarhfoods.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }
}