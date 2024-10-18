package com.asyifafahra.klinikapp_mi2a

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.os.Handler
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        //splash screen
        //handle untuk delay selama beberapa detik
        Handler(Looper.getMainLooper()).postDelayed(
            {
                val intent = Intent(this, StarterPageActivity::class.java)
                startActivity(intent)
                finish()
            },  3000
        )




        //TASK :
        //Splash Screen
        //page start screnn -> klik button get started ini pindah ke login
        //pada page login, ketika klik tulisan sign up --> ini pindah ke sign up
        //page page signcup, ketika klik login --> pindah ke login
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}