package com.example.nauticalapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class TimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)

        // ActionBar customization
        window.statusBarColor = ContextCompat.getColor(this, R.color.transparent)
        supportActionBar?.title = "SEA PRAYER TIMES"
    }
}