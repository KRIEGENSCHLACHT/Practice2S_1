package com.example.count_practice7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AuthorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_author)
    }
    fun back_slide(view: View) {
        val myIntent = Intent(this, MainActivity::class.java)
        startActivity(myIntent)
    }
}