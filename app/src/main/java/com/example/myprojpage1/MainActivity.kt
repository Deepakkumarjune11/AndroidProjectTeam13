package com.example.myprojpage1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
setContentView(R.layout.activity_main)
        var log=Intent(this,Loginpage::class.java)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(log)

        }, 2000)



    }
}