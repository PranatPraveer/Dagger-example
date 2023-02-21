package com.example.dagger

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository{
    fun saveUser(email: String,password: String)
}
class SQLRepository @Inject constructor(val analyticsService: AnalyticsService):UserRepository{
    override fun saveUser(email: String, password: String){
        Log.d(TAG,"User Saved in db")
        analyticsService.trackEvent("Save","Create")
    }
}
@ActivityScope
class FirebaseRepository @Inject constructor(val analyticsService: AnalyticsService) :UserRepository{
    override fun saveUser(email: String, password: String){
        Log.d(TAG,"User Saved in Firebase")
        analyticsService.trackEvent("Save","Create")
    }
}