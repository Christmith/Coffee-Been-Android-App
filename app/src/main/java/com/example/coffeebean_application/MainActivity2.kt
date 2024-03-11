package com.example.coffeebean_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        var btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {
            val intent3 = Intent(this,MainActivity::class.java)
            startActivity(intent3)
        }

        var btn4 = findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener {
            val intent4 = Intent(this,MainActivity3::class.java)
            startActivity(intent4)
        }
    }
}