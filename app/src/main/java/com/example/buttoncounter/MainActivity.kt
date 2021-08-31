package com.example.buttoncounter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.buttoncounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var count =0
        mBinding.button.setOnClickListener {
            count += 1
            mBinding.textview.text = count.toString()

        }

        /* var button = findViewById<Button>(R.id.button)
         var textview = findViewById<TextView>(R.id.textview)
         button.setOnClickListener {
             count += 1
             textview.text = count.toString()
         }*/
    }
}