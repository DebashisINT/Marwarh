package com.marwarhfoods.features.viewAllOrder.interf

import com.marwarhfoods.app.domain.NewOrderGenderEntity
import com.marwarhfoods.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}