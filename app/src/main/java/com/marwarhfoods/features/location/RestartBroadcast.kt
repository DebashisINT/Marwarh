package com.marwarhfoods.features.location

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import com.elvishew.xlog.XLog

class RestartBroadcast : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        XLog.e("RestartBroadcast: " + "=======================Received====================")

        //if (!FTStorageUtils.isMyServiceRunning(LocationFuzedService::class.java, context)) {
            XLog.e("RestartBroadcast: " + "=======================Start Service====================")
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
                context.startForegroundService(Intent(context, LocationFuzedService::class.java))
            else
                context.startService(Intent(context, LocationFuzedService::class.java))
        //}
    }
}