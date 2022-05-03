package com.marwarhfoods.features.viewAllOrder.interf

import com.marwarhfoods.app.domain.NewOrderProductEntity
import com.marwarhfoods.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}