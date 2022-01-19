package edu.washington.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Greetings, UW!", Toast.LENGTH_LONG).show()

        Log.i(TAG, "onCreate(savedInstanceState) event fired\nAdditional data with onCreate: "
                + savedInstanceState.toString())
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart() event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume() event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause() event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop() event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy() event fired")
        Log.e(TAG, "We're going down, Captain!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart() event fired")
    }
}