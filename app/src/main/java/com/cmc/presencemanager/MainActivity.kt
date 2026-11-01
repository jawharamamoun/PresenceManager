package com.cmc.presencemanager

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCommencer= findViewById<android.widget.Button>(R.id.btnCommencer)
        btnCommencer.setOnClickListener{
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)

        }
    }
}