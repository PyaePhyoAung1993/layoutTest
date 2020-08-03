package com.example.layouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.assignment5)
    }
    fun onDigit(view : View){
        Toast.makeText(this,"Button works",Toast.LENGTH_SHORT).show()
    }
}