package com.example.agri_informatics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById(R.id.btn_masuk) as Button
        button.setOnClickListener {
            Toast.makeText(this, "Selamat Datang di Agri-Informatics App ^^", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, Komunitas::class.java))
        }
    }

}