package com.plcoding.ktorpushnotifications.data.remote

interface ApiService {

    suspend fun sendNotification(title: String, description: String)

    companion object {
        const val SEND_NOTIFICATION = "http://10.0.2.2:8080/sendNotification"
    }

}