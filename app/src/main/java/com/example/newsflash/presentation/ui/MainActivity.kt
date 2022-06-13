package com.example.newsflash.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsflash.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_NewsFlash)
        setContentView(R.layout.activity_main)

    }
}