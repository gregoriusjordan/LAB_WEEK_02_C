package com.example.lab_week_02_c

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.*
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lab_week_02_c.R.id.button_single_top

class MainActivity : AppCompatActivity() {
    companion object {
        private const val DEBUG = "DEBUG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(DEBUG, "onCreate")
        val buttonClickListener = OnClickListener { view ->
            when (view.id) {
                R.id.button_standard -> startActivity(
                    Intent(
                        this,
                        StandardActivity::class.java
                    )
                )
                button_single_top -> startActivity(
                    Intent(this,
                        SingleTopActivity::class.java)
                )
            }
        }
        findViewById<Button>(R.id.button_standard).setOnClickListener(buttonClickListener)
        findViewById<Button>(button_single_top).setOnClickListener(buttonClickListener
        )
    }
}

