package com.marwarhfoods.features.login.api.productlistapi

import com.marwarhfoods.app.Pref
import com.marwarhfoods.app.domain.ProductListEntity
import com.marwarhfoods.features.login.model.productlistmodel.ProductListOfflineResponseModel
import com.marwarhfoods.features.login.model.productlistmodel.ProductListOfflineResponseModelNew
import com.marwarhfoods.features.login.model.productlistmodel.ProductListResponseModel
import com.marwarhfoods.features.login.model.productlistmodel.ProductRateListResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 20-11-2018.
 */
class ProductListRepo(val apiService: ProductListApi) {
    fun getProductList(session_token: String, user_id: String, last_update_date: String): Observable<ProductListResponseModel> {
        return apiService.getProductList(session_token, user_id, last_update_date)
    }


    fun getProductRateList(shop_id: String): Observable<ProductRateListResponseModel> {
        return apiService.getProductRateList(Pref.session_token!!, Pref.user_id!!, shop_id)
    }

    fun getProductRateOfflineList(): Observable<ProductListOfflineResponseModel> {
        return apiService.getOfflineProductRateList(Pref.session_token!!, Pref.user_id!!)
    }


    fun getProductRateOfflineListNew(): Observable<ProductListOfflineResponseModelNew> {
        return apiService.getOfflineProductRateListNew(Pref.session_token!!, Pref.user_id!!)
    }
}