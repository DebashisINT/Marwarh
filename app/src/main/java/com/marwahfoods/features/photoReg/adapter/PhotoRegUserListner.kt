package com.marwahfoods.features.photoReg.adapter

import com.marwahfoods.features.photoReg.model.UserListResponseModel

interface PhotoRegUserListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getPhoneOnLick(phone: String)
    fun getWhatsappOnLick(phone: String)
    fun deletePicOnLick(obj: UserListResponseModel)
    fun viewPicOnLick(img_link: String,name : String)
    fun getAadhaarOnLick(obj: UserListResponseModel)
    fun updateTypeOnClick(obj: UserListResponseModel)
}