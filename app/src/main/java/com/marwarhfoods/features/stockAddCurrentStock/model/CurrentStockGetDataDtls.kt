package com.marwarhfoods.features.stockAddCurrentStock.model

import com.marwarhfoods.features.stockCompetetorStock.model.ComGetProduct

class CurrentStockGetDataDtls {
    var visited_datetime: String? = null
    var stock_id: String? = null
    var shop_id: String? = null
    var total_qty: String? = null
    var product_list:ArrayList<CurrGetProduct>? = null
}