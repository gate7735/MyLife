package com.example.mylife.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylife.R // 왜 R 패키지를 임포트할까 

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
    }
}