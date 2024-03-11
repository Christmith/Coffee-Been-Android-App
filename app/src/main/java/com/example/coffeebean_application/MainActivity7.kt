package com.example.coffeebean_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        var btn13 = findViewById<FloatingActionButton>(R.id.fab2)
        btn13.setOnClickListener {
            val intent13 = Intent(this, MainActivity5::class.java)
            startActivity(intent13)
        }

        var btn14 = findViewById<Button>(R.id.btn14)
        btn14.setOnClickListener {
            val intent14 = Intent(this, MainActivity8::class.java)
            startActivity(intent14)
        }

        var txtVw2 = findViewById<TextView>(R.id.txt_signup)
        txtVw2.setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            startActivity(intent)
        }
    }
}