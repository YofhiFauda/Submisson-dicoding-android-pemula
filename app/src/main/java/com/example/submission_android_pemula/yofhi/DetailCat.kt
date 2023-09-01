package com.example.submission_android_pemula.yofhi

import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submission_android_pemula.R

class DetailCat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_cat)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Kucing"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val imgItemPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvDeskripsi: TextView = findViewById(R.id.tv_item_description)

        val tvNamed  = intent.getStringExtra(EXTRA_NAME)
        val tvImg = intent.getStringExtra(EXTRA_PHOTO)
        val tvIden = intent.getStringExtra(EXTRA_IDENTITY)

        tvName.text = tvNamed
        Glide.with(this)
            .load(Integer.valueOf(tvImg))  // photo adalah ID drawable
            .into(imgItemPhoto)
        tvDeskripsi.text = tvIden


    }

    companion object {
        val EXTRA_NAME: String = "extra_name"
        val EXTRA_PHOTO: String = "extra_photo"
        val EXTRA_IDENTITY: String = "extra_identity"
    }

    @Suppress("DEPRECATION")
    override fun onSupportNavigateUp(): Boolean {
        this.onBackPressed()
        return true
    }
}