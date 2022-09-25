package com.example.viewbinding

import android.content.Intent
import android.graphics.Color.GREEN
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Seteo programaticamente el color de fondo a verde
        findViewById<ConstraintLayout>(R.id.layout).setBackgroundColor(GREEN)

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