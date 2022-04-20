package com.marwahfoods.features.alarm.api.visit_report_api

import com.marwahfoods.app.Pref
import com.marwahfoods.features.alarm.model.VisitReportResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 21-02-2019.
 */
class VisitReportRepo(val apiService: VisitReportApi) {
    fun getVisitReportList(from_date: String, to_date: String): Observable<VisitReportResponseModel> {
        return apiService.visitReportResponse(Pref.session_token!!, Pref.user_id!!, from_date, to_date)
    }
}