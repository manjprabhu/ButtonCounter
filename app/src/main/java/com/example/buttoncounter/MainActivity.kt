package com.example.buttoncounter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.buttoncounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

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
    }
}