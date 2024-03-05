package com.example.count_practice7

import android.R.attr.value
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button: Button = findViewById(R.id.button)
        var textView: TextView = findViewById(R.id.textView)
        button.setOnClickListener{
           textView.text = "Доброго дня!"
        }
        var countingButton: Button = findViewById(R.id.counting_button)
        countingButton.setOnClickListener {
            textView.text = "Я нажал на кнопку ${++counter} раз"
        }
    }
    fun slide(view: View) {
        val myIntent = Intent(this, AuthorActivity::class.java)
        startActivity(myIntent)
    }
}