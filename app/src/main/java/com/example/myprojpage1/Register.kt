package com.example.myprojpage1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        getSupportActionBar()?.hide()
        var btnreg=findViewById<Button>(R.id.regbtn1)
        val log= Intent(this,Loginpage::class.java)

        btnreg.setOnClickListener{
            startActivity(log)
        }
    }
}