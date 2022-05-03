package com.marwarhfoods.features.newcollection.model

import com.marwarhfoods.app.domain.CollectionDetailsEntity
import com.marwarhfoods.base.BaseResponse
import com.marwarhfoods.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}