package com.webwork.login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText


const val EXTRA_MESSAGE = "com.webwork.login.MESSAGE"
class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val button = findViewById<Button>(R.id.loginBtn)
        button.setOnClickListener {
            sendMessage()
        }

    }
    //        intent
    fun sendMessage() {
        val editText = findViewById<EditText>(R.id.etNumber)
        val message = editText.text.toString()
        val intent = Intent(this, NextActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}