package com.example.dicodingandroidpemula.activity

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dicodingandroidpemula.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var aboutActivityBinding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        aboutActivityBinding = ActivityAboutBinding.inflate(layoutInflater)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "About"
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#192A5F")))
        setContentView(aboutActivityBinding.root)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}