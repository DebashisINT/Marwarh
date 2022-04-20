package com.marwahfoods.features.login.model.productlistmodel

import com.marwahfoods.app.domain.ModelEntity
import com.marwahfoods.app.domain.ProductListEntity
import com.marwahfoods.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}