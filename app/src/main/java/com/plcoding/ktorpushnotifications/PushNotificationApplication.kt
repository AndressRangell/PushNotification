package com.plcoding.ktorpushnotifications

import android.app.Application
import com.onesignal.OneSignal

class PushNotificationApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }

    companion object {
        private const val ONESIGNAL_APP_ID = "7a6cd1cf-7e3e-455c-9d47-29a890e585b5"
    }

}