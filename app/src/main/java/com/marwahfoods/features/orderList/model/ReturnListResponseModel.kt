package com.marwahfoods.features.orderList.model

import com.marwahfoods.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}