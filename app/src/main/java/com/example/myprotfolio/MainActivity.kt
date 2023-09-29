package com.example.myprotfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnSkill : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSkill = findViewById(R.id.btnSkills)
        btnSkill.setOnClickListener{
            intent  = Intent(this,MainActivity2 ::class.java)
            startActivity(intent)
        }
    }
}