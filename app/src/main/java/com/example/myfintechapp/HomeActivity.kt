package com.example.myfintechapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var tvHome : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        tvHome = findViewById(R.id.tv_home)

        val username: String = intent.getStringExtra("username").toString()

        tvHome.setText(username)
    }
}