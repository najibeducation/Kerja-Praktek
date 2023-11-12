package com.usm.kejrapraktek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.Calendar

class Dasboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dasboard)

        val textViewDate = findViewById<TextView>(R.id.textViewDate)
        val penjualan  = findViewById<ImageButton>(R.id.bt_penjualan)
        val riwayat    = findViewById<ImageButton>(R.id.bt_riwayat)
        val konsumen   = findViewById<ImageButton>(R.id.bt_konsumen)

        val calendar = Calendar.getInstance()
        val dateFormat = SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.getDefault())
        val formattedDate = dateFormat.format(calendar.time)
        textViewDate.text = formattedDate

        penjualan.setOnClickListener {

        }

        riwayat.setOnClickListener {

        }

        konsumen.setOnClickListener {

        }
    }
}