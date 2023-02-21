package com.example.dagger

import android.content.ContentValues.TAG
import android.util.Log

interface AnalyticsService {
    fun trackEvent(eventName:String, eventType:String)
}
class Mixpanel:AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG,"Mixpanel- $eventName - $eventType")
    }

}
class FirebaseAnalytics:AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG,"FirebaseAnalytics- $eventName - $eventType")
    }

}