package com.marwahfoods.features.viewAllOrder.interf

import com.marwahfoods.app.domain.NewOrderGenderEntity
import com.marwahfoods.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}