package com.example.dong5.learnandroidapp

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener({
            link()
        })
    }

    fun link(){

        /*val url = "http://www.example.com"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)*/

        val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/training/constraint-layout"))
        startActivity(i)
    }
}
