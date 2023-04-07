package com.example.faluygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.faluygulamasi.databinding.ActivityEndBinding
import com.example.faluygulamasi.databinding.ActivityFalBakmaBinding
import kotlin.system.exitProcess

class EndActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEndBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        loadControl()
    }

    fun setupBinding() {
        binding = ActivityEndBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
    }

    fun loadControl() {

        var isTimeOver = intent.getBooleanExtra("timeOver", false)
        var falMetni = intent.getStringExtra("falMetni")

        if(isTimeOver) {
            binding.lastStringBar.text = "SÜRE BİTTİ!"
        } else {
            binding.lastStringBar.text = falMetni
        }
    }

    fun quitButtonClick(view : View) {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}