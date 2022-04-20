package com.marwahfoods.features.viewAllOrder.model

import com.marwahfoods.app.domain.NewOrderColorEntity
import com.marwahfoods.app.domain.NewOrderGenderEntity
import com.marwahfoods.app.domain.NewOrderProductEntity
import com.marwahfoods.app.domain.NewOrderSizeEntity
import com.marwahfoods.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

