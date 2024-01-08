package com.android_tuts.quizapp

import android.annotation.SuppressLint
import android.content.ContentValues
import  android.os.Handler
import  android.os.SystemClock
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Chronometer
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    private lateinit var chronometer: Chronometer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        chronometer = findViewById(R.id.chronometer)
        chronometer.base = SystemClock.elapsedRealtime() + 3000
        chronometer.start()

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000) // Delay for 3000 milliseconds
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume:")
        chronometer.start()
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart:")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop:")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause:")
        chronometer.stop()
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart:")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy:")
    }

    companion object {
        private const val TAG = "SplashActivity"
    }
}

//
//@SuppressLint("CustomSplashScreen")
//class SplashActivity : AppCompatActivity() {
//
//    private lateinit var chronometer: Chronometer
//    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
//        super.onCreate(savedInstanceState, persistentState)
//        setContentView(R.layout.activity_splash)
//        chronometer = Chronometer(this)
//        chronometer.base = 3000
//        chronometer.start()
//        chronometer.setOnChronometerTickListener {
//            startActivity(Intent(this, MainActivity::class.java).setFlags(FLAG_ACTIVITY_CLEAR_TOP))
//        }
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.e(ContentValues.TAG, "onResume: ")
//        chronometer.start()
//    }
//
//    override fun onStart() {
//        super.onStart()
//        Log.e(ContentValues.TAG, "onStart: ")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.e(ContentValues.TAG, "onStop: ")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.e(ContentValues.TAG, "onPause: ")
//        chronometer.stop()
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.e(ContentValues.TAG, "onRestart: ")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.e(ContentValues.TAG, "onDestroy: ")
//    }
//}