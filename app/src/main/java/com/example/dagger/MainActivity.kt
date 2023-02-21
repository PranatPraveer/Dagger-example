package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.internal.DaggerGenerated
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService:UserRegistrationService

    @Inject
    lateinit var emailService:EmailService

    @Inject
    lateinit var emailService1:EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val userRepository=UserRepository()
        //val emailService=EmailService()

        //val userRegistrationService = UserRegistrationService(userRepository,emailService)

        val appcomponent=(application as UserApplication).appComponent
        val userRegistrationComponent=DaggerUserRegistrationComponent.factory().create(3,appcomponent)
        userRegistrationComponent.inject(this)

        userRegistrationService.registerUser("praveer.pranat2@gmail.com","1111")
       // emailService.send("mail","praveer.pranat2@gmail.com","sended mail")

    }
}