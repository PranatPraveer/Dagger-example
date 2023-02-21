package com.example.dagger

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository ,
    @MessageQualifier private val notificationService: NotificationService
    ) {

    fun registerUser(email:String, password:String){
        userRepository.saveUser(email, password)
        notificationService.send(email,"praveer.pranat2@gmail.com","User Repository")
    }
}