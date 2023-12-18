package com.krishpan.netclan_explorer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatImageButton


class RefineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refine)

        val Back = findViewById<AppCompatImageButton>(R.id.back)
        Back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}