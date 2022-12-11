package com.klimgroup.openlink

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.klimgroup.openlink.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClickListeners()
    }

    private fun onClickListeners(){
        binding.apply {
            telegram.setOnClickListener { open("https://play.google.com/store/apps/details?id=org.telegram.messenger&hl=ru&gl=US") }
            youtube.setOnClickListener { open("https://play.google.com/store/apps/details?id=com.google.android.youtube&hl=ru&gl=US") }
            instagram.setOnClickListener { open("https://play.google.com/store/apps/details?id=com.instagram.android&hl=ru&gl=US") }
            tiktok.setOnClickListener { open("https://play.google.com/store/apps/details?id=com.zhiliaoapp.musically&hl=ru&gl=US") }
        }
    }

    private fun open(url:String){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}