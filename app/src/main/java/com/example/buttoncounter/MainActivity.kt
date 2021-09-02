package com.example.buttoncounter

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.buttoncounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var TAG : String =  "MainActivity"
    private lateinit var mBinding: ActivityMainBinding
    var count =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mBinding.button.setOnClickListener {
            count += 1
            mBinding.textview.text = count.toString()
        }

        mBinding.buttongoto.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        isOperatorTesting()
    }

    private fun isOperatorTesting() {
        var name = "hello"
        var age = 25
        var salary = 1000.0

        var details: List<Any> =  listOf(name,age,salary)

        for(attribute in details) {

            if(attribute is String) {
                Log.v(TAG,"Name:" +name)
            } else if(attribute is Int) {
                Log.v(TAG,"Age:"+age)
            } else if(attribute is Double) {
                Log.v(TAG,"Salary:"+salary)
            }
        }
    }
}