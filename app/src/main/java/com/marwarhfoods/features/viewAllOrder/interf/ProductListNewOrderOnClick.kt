package com.marwarhfoods.features.viewAllOrder.interf

import com.marwarhfoods.app.domain.NewOrderGenderEntity
import com.marwarhfoods.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}