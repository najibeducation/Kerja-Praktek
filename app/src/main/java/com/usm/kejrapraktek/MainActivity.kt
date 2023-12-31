package com.usm.kejrapraktek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userName = findViewById<EditText>(R.id.userEditText)
        val login = findViewById<ImageButton>(R.id.loginButton)

        login.setOnClickListener {
            val name = userName.text.toString().trim()
            if (name.isNotEmpty()){
                val intent = Intent(this, Dasboard::class.java)
                startActivity(intent)
                Toast.makeText(applicationContext, "Selamat Datang $name", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Form harus diisi!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}