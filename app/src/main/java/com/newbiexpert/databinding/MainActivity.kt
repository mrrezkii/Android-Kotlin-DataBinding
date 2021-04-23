package com.newbiexpert.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.newbiexpert.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.submitButton.setOnClickListener {
            displayGreeting()
        }

    }

    private fun displayGreeting() {
        binding.greetingTextView.text = "Hello! " + binding.nameEditText.text
    }

}