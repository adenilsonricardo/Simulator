package com.example.simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simulator.databinding.ActivityMainBinding

class MainActivityKotlin : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // será inicializado com atraso no onCreate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // setContentView(R.layout.activity_main)
        //val tvHello = findViewById<TextView>(R.id.tvHello)

        binding = ActivityMainBinding.inflate(layoutInflater) // Quando inicializar o onCreate o elemento será criado
        setContentView(binding.root)

        binding.tvHello.text = "Teste" // Text HardCode não recomendado
    }
}