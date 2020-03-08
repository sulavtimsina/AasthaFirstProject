package com.example.aasthafirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showMessage(view: View) {
        Toast.makeText(this, "Hello There!Nice to meet you",Toast.LENGTH_LONG).show()
    }
}
