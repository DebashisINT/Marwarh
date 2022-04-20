package com.marwahfoods.features.lead.api

import com.marwahfoods.features.NewQuotation.api.GetQuotListRegRepository
import com.marwahfoods.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}