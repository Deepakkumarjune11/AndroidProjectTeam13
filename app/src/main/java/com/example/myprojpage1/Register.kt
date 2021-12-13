package com.example.myprojpage1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        getSupportActionBar()?.hide()
    }
}