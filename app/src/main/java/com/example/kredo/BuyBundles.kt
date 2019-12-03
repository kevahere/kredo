package com.example.kredo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hover.sdk.api.HoverParameters
import android.R.attr.data
import android.widget.Toast


class BuyBundles : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_bundles)


    }

    fun buyBundleDaily(view: View) {
        val intent = Intent(this, BuyBundledetails::class.java).apply{
            putExtra(EXTRA_MESSAGE, "Hello Kevin")
        }
        startActivity(intent)

    }

}
