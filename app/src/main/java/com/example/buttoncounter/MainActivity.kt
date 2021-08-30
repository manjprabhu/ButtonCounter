package com.example.buttoncounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        var textview = findViewById<TextView>(R.id.textview)
        var count = 0
        button.setOnClickListener {
            count += 1
            textview.text = count.toString()
        }
    }
}