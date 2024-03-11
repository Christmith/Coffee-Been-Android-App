package com.example.coffeebean_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        var imgView = findViewById<ImageView>(R.id.imageView8)
        imgView.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }

        var imgView4 = findViewById<ImageView>(R.id.imageView29)
        imgView4.setOnClickListener {
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)
        }

        var imgView5 = findViewById<ImageView>(R.id.imageView27)
        imgView5.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }

        var imgView6 = findViewById<ImageView>(R.id.imageView28)
        imgView6.setOnClickListener {
            val intent = Intent(this, MainActivity14::class.java)
            startActivity(intent)
        }

        var imgView8 = findViewById<ImageView>(R.id.imageView21)
        imgView8.setOnClickListener {
            val intent = Intent(this, MainActivity15::class.java)
            startActivity(intent)
        }
    }
}