package com.example.coffeebean_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        var btn5 = findViewById<Button>(R.id.btn5)
        btn5.setOnClickListener {
            val intent5 = Intent(this,MainActivity2::class.java)
            startActivity(intent5)
        }

        var btn6 = findViewById<Button>(R.id.btn6)
        btn6.setOnClickListener {
            val intent6 = Intent(this,MainActivity4::class.java)
            startActivity(intent6)
        }
    }

}