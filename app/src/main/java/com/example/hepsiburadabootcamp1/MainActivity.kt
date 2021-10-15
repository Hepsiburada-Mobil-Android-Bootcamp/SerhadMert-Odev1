package com.example.hepsiburadabootcamp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    val btn_screenOne by lazy { findViewById<View>(R.id.btn_screen1) }
    val btn_liveData by lazy { findViewById<View>(R.id.btn_liveData) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_screenOne.setOnClickListener{
            startActivity(Intent(this,ScreenOneActivity::class.java))
        }

        btn_liveData.setOnClickListener{
            startActivity(Intent(this,LiveDataActivity::class.java))
        }

    }
}