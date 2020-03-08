package com.example.aasthafirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var title: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Hello"
    }

    fun showMessage(view: View) {
        Toast.makeText(applicationContext, title + findViewById<TextView>(R.id.textViewMessage).text,Toast.LENGTH_LONG).show()
    }
}
