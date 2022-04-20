package com.marwahfoods.features.viewAllOrder.interf

import com.marwahfoods.app.domain.NewOrderGenderEntity
import com.marwahfoods.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}