package com.marwahfoods.features.location.api

import com.marwahfoods.app.Pref
import com.marwahfoods.base.BaseResponse
import com.marwahfoods.features.location.model.AppInfoInputModel
import com.marwahfoods.features.location.model.AppInfoResponseModel
import com.marwahfoods.features.location.model.ShopDurationRequest
import com.marwahfoods.features.location.shopdurationapi.ShopDurationApi
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