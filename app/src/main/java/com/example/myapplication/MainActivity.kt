package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1=findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            val intent= Intent(this,SecondPage::class.java)
            startActivity(intent);

        }

    }

    }