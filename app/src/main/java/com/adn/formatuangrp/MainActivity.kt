package com.adn.formatuangrp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btn)
        btn.setOnClickListener({
            val inputan : EditText = findViewById(R.id.input)
            val output : TextView = findViewById(R.id.output)

            val formatter = NumberFormat.getCurrencyInstance(Locale("in", "ID"))

            val  hasilFormat = formatter.format(inputan.text.toString().toDouble())
            output.text = hasilFormat
        })
    }
}