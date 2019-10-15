package com.example.videoplayer

import android.app.Dialog
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.VideoView

class listvideos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listvideos)


    }

    fun alert_play(view: View)
    {
        var imageclicked=findViewById<ImageView>(view.id)

        var alert=Dialog(this@listvideos)
        alert.setContentView(R.layout.cusyom_alert)
        var video=alert.findViewById<VideoView>(R.id.video2)
        var play=alert.findViewById<Button>(R.id.pla)
        var pause=alert.findViewById<Button>(R.id.pau)
        var resume=alert.findViewById<Button>(R.id.res)

        when(imageclicked.id)
        {
            R.id.image1->{
                val videoUri= Uri.parse("android.resource://"+packageName+"/"+R.raw.v)
                video.setVideoURI(videoUri)
                alert.show()
                play.setOnClickListener()
                {
                    video.start()
                }
                pause.setOnClickListener()
                {
                    video.pause()
                }
                resume.setOnClickListener()
                {
                    video.resume()
                }
            }
            R.id.image2->{
                val videoUri= Uri.parse("android.resource://"+packageName+"/"+R.raw.ve)
                video.setVideoURI(videoUri)
                alert.show()
                play.setOnClickListener()
                {
                    video.start()
                }
                pause.setOnClickListener()
                {
                    video.pause()
                }
                resume.setOnClickListener()
                {
                    video.resume()
                }
            }
            R.id.image3->{
                val videoUri= Uri.parse("android.resource://"+packageName+"/"+R.raw.ved)
                video.setVideoURI(videoUri)
                alert.show()
                play.setOnClickListener()
                {
                    video.start()
                }
                pause.setOnClickListener()
                {
                    video.pause()
                }
                resume.setOnClickListener()
                {
                    video.resume()
                }
            }
        }

    }
}
