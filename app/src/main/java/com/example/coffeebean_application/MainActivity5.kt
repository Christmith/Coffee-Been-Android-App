package com.example.coffeebean_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        var btn9 = findViewById<Button>(R.id.btn9)
        btn9.setOnClickListener {
            val intent9 = Intent(this, MainActivity7::class.java)
            startActivity(intent9)
        }

        var btn10 = findViewById<Button>(R.id.btn10)
        btn10.setOnClickListener {
            val intent10 = Intent(this, MainActivity6::class.java)
            startActivity(intent10)
        }
    }
}