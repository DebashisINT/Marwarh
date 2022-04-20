package com.marwahfoods.features.viewAllOrder.interf

import com.marwahfoods.app.domain.NewOrderColorEntity
import com.marwahfoods.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}