package com.marwarhfoods.features.viewAllOrder.interf

import com.marwarhfoods.app.domain.NewOrderGenderEntity
import com.marwarhfoods.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}