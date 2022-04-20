package com.marwahfoods.features.viewAllOrder.interf

import com.marwahfoods.app.domain.NewOrderProductEntity
import com.marwahfoods.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}