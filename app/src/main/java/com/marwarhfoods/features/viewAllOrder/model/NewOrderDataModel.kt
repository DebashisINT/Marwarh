package com.marwarhfoods.features.viewAllOrder.model

import com.marwarhfoods.app.domain.NewOrderColorEntity
import com.marwarhfoods.app.domain.NewOrderGenderEntity
import com.marwarhfoods.app.domain.NewOrderProductEntity
import com.marwarhfoods.app.domain.NewOrderSizeEntity
import com.marwarhfoods.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

