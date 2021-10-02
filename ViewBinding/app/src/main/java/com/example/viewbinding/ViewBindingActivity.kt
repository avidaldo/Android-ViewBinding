package com.example.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding


/* Activity creada desmarcando "Generate a Layout File" para poder usar el mismo layout en ambas */


class ViewBindingActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding // View Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* a partir de aquí, tenemos una referencia directa a todas las vistas desde dentro del
        objeto binding */

        binding.textView.setOnClickListener {
            Toast.makeText(
                this,
                "TextView localizado mediante View Binding",
                Toast.LENGTH_SHORT
            ).show()}


        binding.button.setOnClickListener {
            startActivity(
                Intent(
                    this@ViewBindingActivity,
                    MainActivity::class.java
                )
            )
        }




    }
}