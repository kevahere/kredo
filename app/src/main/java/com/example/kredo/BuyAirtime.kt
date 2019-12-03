package com.example.kredo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class BuyAirtime : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_airtime)
    }

    fun purchaseAirtime(){
        val amount = findViewById<EditText>(R.id.editText);
        val i = HoverParameters.Builder(this)
            .request("51e10d07")
            .buildIntent()
        startActivityForResult(i,0)
    }
}
