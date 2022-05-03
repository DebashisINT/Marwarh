package com.marwarhfoods.features.lead.api

import com.marwarhfoods.features.NewQuotation.api.GetQuotListRegRepository
import com.marwarhfoods.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}