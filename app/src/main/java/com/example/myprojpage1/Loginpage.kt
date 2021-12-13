package com.example.myprojpage1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)
        getSupportActionBar()?.hide()

        val new=findViewById<TextView>(R.id.textView2)
        val reg=Intent(this,Register::class.java)

        new.setOnClickListener{
           startActivity(reg)
       }



    }

}