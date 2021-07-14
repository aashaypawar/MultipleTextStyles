package org.geeksforgeeks.multipletextstyles

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv1 = findViewById<TextView>(R.id.textView1)
        val nBtn = findViewById<Button>(R.id.btnN)
        val iBtn = findViewById<Button>(R.id.btnI)
        val bBtn = findViewById<Button>(R.id.btnB)
        val ibBtn = findViewById<Button>(R.id.btnIB)

        nBtn.setOnClickListener {
            tv1.setTextAppearance(R.style.text_normal)
        }

        iBtn.setOnClickListener {
            tv1.setTextAppearance(R.style.text_italic)
        }

        bBtn.setOnClickListener {
            tv1.setTextAppearance(R.style.text_bold)
        }

        ibBtn.setOnClickListener {
            tv1.setTextAppearance(R.style.text_italic_bold)
        }
    }
}