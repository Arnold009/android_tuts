package com.android_tuts.listeners_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doBeforeTextChanged
import com.android_tuts.listeners_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    // for name field
    binding.name.doBeforeTextChanged()
    }
}