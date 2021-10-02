package com.example.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.button)
        val tv = findViewById<TextView>(R.id.textView)

        tv.setOnClickListener {
            Toast.makeText(
                this,
                "TextView localizado mediante findViewByid",
                Toast.LENGTH_SHORT
            ).show()
        }

        boton.setOnClickListener {
            startActivity(
                Intent(
                this@MainActivity,
                ViewBindingActivity::class.java
            )
            )
        }


    }
}