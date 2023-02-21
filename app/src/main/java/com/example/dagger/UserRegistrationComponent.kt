package com.example.dagger

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ActivityScope
@Component(dependencies = [AppComponent::class],modules = [UserRepositoryModule::class,NotificationServiceModule::class])
 interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    fun getEmailService():EmailService
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int,appComponent: AppComponent): UserRegistrationComponent
    }
}