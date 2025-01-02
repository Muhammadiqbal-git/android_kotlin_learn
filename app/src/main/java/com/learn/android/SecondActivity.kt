package com.learn.android

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bttn = findViewById<MaterialButton>(R.id.btnGoOut)

        bttn.setOnClickListener{
            val intentVal = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(intentVal)
        }
    }
}