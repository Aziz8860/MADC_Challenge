package com.example.agri_informatics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.counter_kehadiran.*

class Counter : AppCompatActivity() {
    private var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.counter_kehadiran)

        nilai.setText("" + id)

        btnTambah.setOnClickListener {
            nilai.setText("" + id++)
        }

        btnKurang.setOnClickListener {
            nilai.setText("" + id--)
        }

        btnReset.setOnClickListener {
            id = 0
            nilai.setText("" + id)
        }
    }

}
