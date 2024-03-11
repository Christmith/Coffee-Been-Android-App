package com.example.coffeebean_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView

class MainActivity15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main15)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        var imgView1 = findViewById<ImageView>(R.id.imageView8)
        imgView1.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }

        var imgView2 = findViewById<ImageView>(R.id.imageView22)
        imgView2.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }

        var imgView3 = findViewById<ImageView>(R.id.imageView54a)
        imgView3.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }

        var imgView4= findViewById<ImageView>(R.id.imageView55)
        imgView4.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }

        var imgView5= findViewById<ImageView>(R.id.imageView56)
        imgView5.setOnClickListener {
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)
        }

        var imgView6= findViewById<ImageView>(R.id.imageView57)
        imgView6.setOnClickListener {
            val intent = Intent(this, MainActivity14::class.java)
            startActivity(intent)
        }

        var imgView7= findViewById<ImageView>(R.id.imageView58)
        imgView7.setOnClickListener {
            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }
        var imgView8= findViewById<ImageView>(R.id.imageView63)
        imgView8.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }

    }
}