package com.example.kredo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hover.sdk.api.Hover

const val EXTRA_MESSAGE = "com.example.kredo.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Hover.initialize(this)
    }

    fun buyAirtime(view: View) {
        val intent = Intent(this, BuyAirtime::class.java).apply{
            putExtra(EXTRA_MESSAGE, "Hello Kevin")
        }
        startActivity(intent)
    }
    fun buyBundles(view: View) {
        val intent = Intent(this, BuyBundles::class.java).apply{
            putExtra(EXTRA_MESSAGE, "Hello Kevin")
        }
        startActivity(intent)
    }
}
