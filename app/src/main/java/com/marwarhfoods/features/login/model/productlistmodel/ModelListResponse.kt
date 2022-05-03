package com.marwarhfoods.features.login.model.productlistmodel

import com.marwarhfoods.app.domain.ModelEntity
import com.marwarhfoods.app.domain.ProductListEntity
import com.marwarhfoods.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}