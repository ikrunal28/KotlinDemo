package com.hometest.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.hometest.kotlindemo.databinding.ActivityMainBinding

    lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding:ActivityMainBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // var str=binding.tv1.text.toString()
        binding.btn.setOnClickListener{
            Log.d("name",binding.tv1.text.toString())
            Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
        }
    }
}