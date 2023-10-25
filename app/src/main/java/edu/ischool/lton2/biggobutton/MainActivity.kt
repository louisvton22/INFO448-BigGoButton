package edu.ischool.lton2.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var clicks = 0
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            clicks += 1
            button.text = when (clicks) {
                1 -> "${getString(R.string.pushed)} $clicks time"
                0 -> getString(R.string.push_me)
                else -> "${getString(R.string.pushed)} $clicks times"
            }

        }


    }
}