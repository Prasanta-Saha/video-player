package com.example.videoplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val defvideo=findViewById<Button>(R.id.def_play)
        val listvideo=findViewById<Button>(R.id.list_video)

        defvideo.setOnClickListener()
        {
            val intent=Intent(this@MainActivity,singlevideo::class.java)
            startActivity(intent)
        }

        listvideo.setOnClickListener()
        {
            val intent=Intent(this@MainActivity,listvideos::class.java)
            startActivity(intent)
        }

    }
}
