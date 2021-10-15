package com.example.hepsiburadabootcamp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer

class LiveDataActivity : AppCompatActivity() {

    val timer by lazy { findViewById<TextView>(R.id.txt_timer) }
    private val _time = MutableLiveData<Long>()
    val time: LiveData<Long>
        get() = _time
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        timer()
        time.observe(this, Observer {
            timer.text=it.toString()
        })
    }
    fun timer() {
        val countDownTimer = object : CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                _time.value=millisUntilFinished/1000
            }
            override fun onFinish() {
            }
        }
        countDownTimer.start()
    }

}