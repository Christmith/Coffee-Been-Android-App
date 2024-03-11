package com.example.coffeebean_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        var btn11 = findViewById<FloatingActionButton>(R.id.fab1)
        btn11.setOnClickListener {
            val intent11 = Intent(this, MainActivity5::class.java)
            startActivity(intent11)
        }

        var btn12 = findViewById<Button>(R.id.btn12)
        btn12.setOnClickListener {
            val intent12 = Intent(this, MainActivity8::class.java)
            startActivity(intent12)
        }


        var txtVw1 = findViewById<TextView>(R.id.txt_sign_in)
        txtVw1.setOnClickListener {
            val intent = Intent(this,MainActivity7::class.java)
            startActivity(intent)

        }
    }


}