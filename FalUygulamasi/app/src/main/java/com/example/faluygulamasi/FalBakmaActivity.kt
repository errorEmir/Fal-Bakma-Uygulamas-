package com.example.faluygulamasi

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.example.faluygulamasi.databinding.ActivityFalBakmaBinding
import com.example.faluygulamasi.databinding.ActivityMainBinding
import kotlin.random.Random

class FalBakmaActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFalBakmaBinding
    private val falList : List<String> = listOf(
            "Aşkın etmiş onu şair\n" +
            "Her gün yazar bir şiir\n" +
            "Sensin ilham perisi\n" +
            "Tüm satırlar sana dair",

            "Kısmetinde var biri\n" +
            "Mutlu eder seni\n" +
            "Hem maddi hem manevi\n" +
            "Üyelikten romantik biri",

            "Fazla şey beklemez senden\n" +
            "İster hayatında çekidüzen\n" +
            "Evliliktir bunun sonu\n" +
            "Seversen onu gönülden"
        )
    private lateinit var randomNum : Number
    private lateinit var timer : CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()

        timer = timer()
    }

    fun setupBinding() {
        binding = ActivityFalBakmaBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
    }

    fun timer() : CountDownTimer {
        var obj = object : CountDownTimer(10 * 1000, 1000) {
            override fun onTick(p0: Long) {
                binding.timeBar.text = "Süre: ${p0/1000}"
            }

            override fun onFinish() {
                val intent = Intent(applicationContext, EndActivity::class.java)
                val isTimeOver = true
                intent.putExtra("timeOver", isTimeOver)
                startActivity(intent)

            }
        }.start()

        return obj
    }

    fun algo(random : Int) {
        val intent = Intent(this, EndActivity::class.java)
        intent.putExtra("falMetni", falList[random])
        startActivity(intent)
        timer.cancel()
        finish()
    }

    fun cardButton1Click(view: View) {
        randomNum = Random.nextInt(0, falList.size)
        algo(randomNum.toInt())
    }
    fun cardButton2Click(view: View) {
        randomNum = Random.nextInt(0, falList.size)
        algo(randomNum.toInt())
    }
    fun cardButton3Click(view: View) {
        randomNum = Random.nextInt(0, falList.size)
        algo(randomNum.toInt())
    }
    fun cardButton4Click(view: View) {
        randomNum = Random.nextInt(0, falList.size)
        algo(randomNum.toInt())
    }

}