package com.marwahfoods.features.addAttendence.api.leavetytpeapi

import com.marwahfoods.app.Pref
import com.marwahfoods.base.BaseResponse
import com.marwahfoods.features.addAttendence.model.ApprovalLeaveResponseModel
import com.marwahfoods.features.addAttendence.model.LeaveTypeResponseModel
import com.marwahfoods.features.leaveapplynew.model.ApprovalRejectReqModel
import io.reactivex.Observable

/**
 * Created by Saikat on 22-11-2018.
 */
class LeaveTypeRepo(val apiService: LeaveTypeApi) {
    fun getLeaveTypeList(): Observable<LeaveTypeResponseModel> {
        return apiService.getLeaveTypeList(Pref.session_token!!, Pref.user_id!!)
    }


    fun getApprovalLeaveList(userId:String): Observable<ApprovalLeaveResponseModel> {
        return apiService.getApprovalLeaveList(Pref.session_token!!,userId)
    }

    fun postApprovalRejectclick(ApprovalRejectReqModel: ApprovalRejectReqModel): Observable<BaseResponse> {
        return apiService.postApprovalRejectclick(ApprovalRejectReqModel)
    }
}