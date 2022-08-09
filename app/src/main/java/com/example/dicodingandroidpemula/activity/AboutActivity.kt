package com.example.dicodingandroidpemula.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dicodingandroidpemula.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var aboutActivityBinding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        aboutActivityBinding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(aboutActivityBinding.root)
    }
}