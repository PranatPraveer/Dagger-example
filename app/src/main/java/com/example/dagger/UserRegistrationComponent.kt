package com.example.dagger

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
 interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    fun getEmailService():EmailService
    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int,): UserRegistrationComponent
    }
}