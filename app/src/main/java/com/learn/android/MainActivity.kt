package com.learn.android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)
        val bttn = findViewById<MaterialButton>(R.id.btnGoToSecond)

        bttn.setOnClickListener{
            println("go to second")
            val intentSecond = Intent(this, SecondActivity::class.java)
            startActivity(intentSecond)
        }
    }
}