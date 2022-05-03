package com.marwarhfoods.features.viewAllOrder.interf

import com.marwarhfoods.app.domain.NewOrderColorEntity
import com.marwarhfoods.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}