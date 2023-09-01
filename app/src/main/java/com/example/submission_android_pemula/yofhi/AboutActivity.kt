package com.example.submission_android_pemula.yofhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.submission_android_pemula.R

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)

    }
    @Suppress("DEPRECATION")
    override fun onSupportNavigateUp(): Boolean {
        this.onBackPressed()
        return true
    }
}