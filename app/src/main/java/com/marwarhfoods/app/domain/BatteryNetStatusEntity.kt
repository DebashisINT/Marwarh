package com.marwarhfoods.app.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.marwarhfoods.app.AppConstant

/**
 * Created by Saikat on 17-Aug-20.
 */
@Entity(tableName = AppConstant.BATTERY_NET_TABLE)
class BatteryNetStatusEntity {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0

    @ColumnInfo(name = "bat_net_id")
    var bat_net_id: String? = null

    @ColumnInfo(name = "date_time")
    var date_time: String? = null

    @ColumnInfo(name = "date")
    var date: String? = null

    @ColumnInfo(name = "bat_status")
    var bat_status: String? = null

    @ColumnInfo(name = "bat_level")
    var bat_level: String? = null

    @ColumnInfo(name = "net_type")
    var net_type: String? = null

    @ColumnInfo(name = "mob_net_type")
    var mob_net_type: String? = null

    @ColumnInfo(name = "device_model")
    var device_model: String? = null

    @ColumnInfo(name = "android_version")
    var android_version: String? = null

    @ColumnInfo(name = "isUploaded")
    var isUploaded: Boolean = false
}