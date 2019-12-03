package com.example.kredo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.hover.sdk.api.HoverParameters

class BuyBundledetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_bundledetails)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 0 && resultCode == Activity.RESULT_OK) {
            val uuid = data?.getStringExtra("uuid")
            Toast.makeText(this, uuid, Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Error: " + (data?.getStringExtra("error") ?: "0"), Toast.LENGTH_LONG).show()
        }
    }

    fun buyBundleTwentyBOb(view: View) {
        val intent = Intent(this, BuyBundledetails::class.java).apply{
            putExtra(EXTRA_MESSAGE, "Hello Kevin")
        }
        val i = HoverParameters.Builder(this)
            .request("59a48863")
            .buildIntent()
        startActivityForResult(i,0)
    }

    fun buyBillionaireBundles(view: View) {
        val i = HoverParameters.Builder(this)
            .request("51e10d07")
            .extra("phoneNumber", "233435678")
            .buildIntent()
        startActivityForResult(i,0)
    }

    fun payIsh(view: View){
        val i = HoverParameters.Builder(this)
            .request("21dd1ec3")
            .extra("phoneNumber","0725168131")
            .buildIntent()
        startActivityForResult(i,0)
    }


}
