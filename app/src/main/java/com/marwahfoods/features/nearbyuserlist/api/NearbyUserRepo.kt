package com.marwahfoods.features.nearbyuserlist.api

import com.marwahfoods.app.Pref
import com.marwahfoods.features.nearbyuserlist.model.NearbyUserResponseModel
import com.marwahfoods.features.newcollection.model.NewCollectionListResponseModel
import com.marwahfoods.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}