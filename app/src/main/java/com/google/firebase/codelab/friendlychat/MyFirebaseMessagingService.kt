package com.google.firebase.codelab.friendlychat

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class MyFirebaseMessagingService: FirebaseMessagingService() {
    override    fun onNewToken(p0: String) {
        Log.i("TOKEN",p0)
        super.onNewToken(p0)
    }
}