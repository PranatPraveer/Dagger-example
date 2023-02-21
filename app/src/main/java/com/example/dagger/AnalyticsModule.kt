package com.example.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getAnalyticsService(): AnalyticsService{
        return Mixpanel()
    }
}