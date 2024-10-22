package com.example.conversoreurodolar

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.conversoreurodolar.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConvert.setOnClickListener {
            val inputEuro = binding.inputEuro.text

            if(!inputEuro.toString().isEmpty()){
                val euros = inputEuro.toString().toDouble()
                val dollars = String.format("%.2f", euros * 0.8)

                binding.convertedValue.text = "${dollars}$"
            } else {
                binding.convertedValue.text = "0$"
            }
        }
    }
}
