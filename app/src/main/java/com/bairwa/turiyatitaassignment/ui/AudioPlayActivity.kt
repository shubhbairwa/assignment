package com.bairwa.turiyatitaassignment.ui

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import com.bairwa.turiyatitaassignment.R
import kotlinx.android.synthetic.main.activity_audio_play.*
import java.util.*

class AudioPlayActivity : AppCompatActivity() {
    lateinit var player:MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_play)
        player= MediaPlayer.create(this,R.raw.song)
        ivpause.visiblity=View.INVISIBLE

    }


     fun play(v:View){
        if (player==null){
            player= MediaPlayer.create(this,R.raw.song)
        }
        player.start()
         ivPlay.visibility=View.INVISIBLE
         ivPause.visibility=View.VISIBLE


    }
     fun pause(v:View){
        if (player!=null){
            player.pause()
        }
         ivPause.visibility=View.INVISIBLE
         ivPlay.visibility=View.VISIBLE

    }


    private fun stopPlayer() {
        if (player!=null){
            player.release()


        }
    }

    override fun onStop() {
        super.onStop()
    stopPlayer()
    }

//    override fun onBackPressed() {
//        super.onBackPressed()
//        Intent(this,MainActivity::class.java).also {
//            startActivity(it)
//        }


}
