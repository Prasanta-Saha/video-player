package com.example.videoplayer

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView

class singlevideo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singlevideo)

        val video=findViewById<VideoView>(R.id.singlevideo_view)
        val play=findViewById<Button>(R.id.play_btn)
        val pause=findViewById<Button>(R.id.pause_btn)
        val resume=findViewById<Button>(R.id.resume_btn)

        val videoUri= Uri.parse("android.resource://"+packageName+"/"+R.raw.v)
        video.setVideoURI(videoUri)

        play.setOnClickListener()
        {
            video.start()
        }

        resume.setOnClickListener()
        {
            video.resume()
        }

        pause.setOnClickListener()
        {
            video.pause()
        }
    }
}
