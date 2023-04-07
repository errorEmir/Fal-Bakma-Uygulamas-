package com.example.faluygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.faluygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
    }

    fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
    }

    fun startButtonClick(view: View) {
        val intent = Intent(this, FalBakmaActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun endButtonClick(view: View) {
        finish();
        System.exit(0);
    }

}