package com.blackspring.part9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// MEMBUAT INTERFACE
interface StarSignListener{
    fun onSelected(id: Int)
}

class MainActivity : AppCompatActivity(), StarSignListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSelected(id: Int) {
        TODO("Not yet implemented")
    }
}