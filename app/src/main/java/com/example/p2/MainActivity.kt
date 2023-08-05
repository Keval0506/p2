package com.example.p2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayMessage("onCreate")
    }

    override fun onStart() {
        super.onStart()
        displayMessage("onStart")
    }

    override fun onResume() {
        super.onResume()
        displayMessage("onResume")
    }

    override fun onPause() {
        super.onPause()
        displayMessage("onPause")
    }

    override fun onStop() {
        super.onStop()
        displayMessage("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        displayMessage("onDestroy")
    }
    fun displayMessage(msg:String){
        Toast.makeText(this,"This is a $msg",Toast.LENGTH_LONG).show()
        Log.i(TAG,"$msg" + "is called")
    }
}