package com.example.coffeebean_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        var btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            val intent1 = Intent(this, MainActivity5::class.java)
            startActivity(intent1)
        }

        var btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            val intent2 = Intent(this, MainActivity2::class.java)
            startActivity(intent2)
        }

    }
}