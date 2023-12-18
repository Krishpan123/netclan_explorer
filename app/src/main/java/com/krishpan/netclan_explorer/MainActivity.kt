package com.krishpan.netclan_explorer


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatImageButton



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val refine = findViewById<AppCompatImageButton>(R.id.refine_btn)
        refine.setOnClickListener {
            startActivity(Intent(this, RefineActivity::class.java))
        }

    }
}