package com.marwarhfoods.features.document.api

import com.marwarhfoods.features.dymanicSection.api.DynamicApi
import com.marwarhfoods.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}