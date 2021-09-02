package com.example.buttoncounter

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        smartCasttest()
    }

    private fun smartCast() {

        var name = "Test name"
        var age = 25
        var SSN = 7473273452783
        var salary = 50000

        if (name is String) {
            Log.v("TAG", "name length :" + name.length)
        }

        //return true if name is not a string.
        //Return false if name is a String
        if (name !is String)
            return
        else {
            Log.v("TAG", "name length 2:" + name.length)
        }

    }

    private fun smartCasttest() {
        var name : String
        name = "hello"

        var x = 1000

        var y = 1000.01F

        var z = 12293908324892348

        when(name) {
          is String -> Log.v("===>>>" ,"Name Length:"+name.length)
        }


    }

}