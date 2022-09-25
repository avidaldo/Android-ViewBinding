package com.example.viewbinding

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding


/* https://developer.android.com/topic/libraries/view-binding */

/* Activity creada desmarcando "Generate a Layout File" para poder usar el mismo layout en ambas */


class ViewBindingActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    /* View Binding crea automáticamente una binding class a partir del layout en xml. El nombre
    de esta clase se genera automáticamente (activity_main.xml -> ActivityMainBinding).
     */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        /* El método estático inflate instancia la binding class */


        /* a partir de aquí, tenemos una referencia directa a todas las vistas desde dentro del
        objeto binding. El id de cada elemento del xml pasa a ser un atributo de binding */

        setContentView(binding.root) // root será referencia al elemento raiz aunque no tuviese id



        /* Seteo programaticamente el color de fondo a azul
        con el view binding no es necesario asignar un id al layout */
        binding.root.setBackgroundColor(Color.BLUE)
        // aunque binding.layout también funciona, ya que puse ese id para cambiarlo desde MainActivty



        binding.textView.setOnClickListener {
            Toast.makeText(
                this,
                "TextView localizado mediante View Binding",
                Toast.LENGTH_SHORT
            ).show()}


        binding.button.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity::class.java
                )
            )
        }




    }
}