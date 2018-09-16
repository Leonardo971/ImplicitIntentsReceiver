package com.example.leona.implicitintentsreceiver

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val text_uri_message=findViewById<TextView>(R.id.text_uri_message)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent=intent
        val uri=intent.data
        if (uri!=null)
        {
            text_uri_message.text="URI: "+uri.toString()
        }
    }


}
