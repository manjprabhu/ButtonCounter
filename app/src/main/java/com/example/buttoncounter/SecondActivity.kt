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

        val name = "Test name"

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
        val name = "hello"

        val x = 1000

        val y = 1000.01F

        val z = 12293908324892348


        val details: List<Any> =  listOf(name,x,y,z)

        for(attribute in details) {
            when(attribute) {
                is String -> Log.v("===>>>"," Name : $name")
                is Int -> Log.v("===>>>"," X: $x")
                is Float -> Log.v("===>>>" , "Y : $y")
                is Long -> Log.v("===>>>","Z $z")
            }
        }

        when (name) {
            is String -> Log.v("===>>>", "Name Length:" + name.length)

        }

    }

}