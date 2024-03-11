package com.example.coffeebean_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        var btn7 = findViewById<Button>(R.id.btn7)
        btn7.setOnClickListener {
            val intent7 = Intent(this,MainActivity3::class.java)
            startActivity(intent7)
        }

        var btn8 = findViewById<Button>(R.id.btn8)
        btn8.setOnClickListener {
            val intent8 = Intent(this,MainActivity5::class.java)
            startActivity(intent8)
        }
    }
}