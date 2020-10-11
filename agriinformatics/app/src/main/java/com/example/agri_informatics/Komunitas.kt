package com.example.agri_informatics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Komunitas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_komunitas)

        val buttonCounter = findViewById<ImageView>(R.id.btnCounter) as ImageView
        buttonCounter.setOnClickListener {
            startActivity(Intent(this, Counter::class.java))
        }

        val buttonTentang = findViewById<ImageView>(R.id.btnTentang) as ImageView
        buttonTentang.setOnClickListener {
            startActivity(Intent(this, TentangSaya::class.java))
        }

        val buttonGaleri = findViewById<ImageView>(R.id.btnGaleri) as ImageView
        buttonGaleri.setOnClickListener {
            startActivity(Intent(this, GaleriKegiatan::class.java))
        }
    }

}