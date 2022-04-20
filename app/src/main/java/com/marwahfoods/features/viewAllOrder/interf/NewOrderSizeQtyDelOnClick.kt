package com.marwahfoods.features.viewAllOrder.interf

import com.marwahfoods.app.domain.NewOrderGenderEntity
import com.marwahfoods.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}