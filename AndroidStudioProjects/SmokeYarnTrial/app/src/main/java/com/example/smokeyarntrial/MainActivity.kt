 package com.example.smokeyarntrial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

     class MainActivity : AppCompatActivity() {


         override fun onCreate(savedInstances: Bundle?) {
             super.onCreate(savedInstances)
             setContentView(R.layout.activity_main)

             val start = findViewById<ImageView>(R.id.imageButton)
             val adminLogin = findViewById<ImageView>(R.id.menuLogo)

             start.setOnClickListener {
                 val intent = Intent(this, ReportersDashboard::class.java)
                 startActivity(intent)
                 finish()


                 }

             adminLogin.setOnClickListener {
                 val intent = Intent(this, AdminLogin::class.java)
                 startActivity(intent)
                 finish()
             }

         }
     }