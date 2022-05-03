package com.marwarhfoods.features.orderList.model

import com.marwarhfoods.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}