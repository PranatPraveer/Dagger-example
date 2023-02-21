package com.example.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {

    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount:Int): NotificationService{
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}