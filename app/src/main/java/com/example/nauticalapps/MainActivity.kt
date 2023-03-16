package com.example.nauticalapps

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    private lateinit var tvDate: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ActionBar customization
        window.statusBarColor = ContextCompat.getColor(this, R.color.transparent)
        supportActionBar?.title = "SEA PRAYER TIMES"

        // DatePicker configuration
        tvDate = findViewById(R.id.tvDate)
        tvDate.setOnClickListener { datePicker() }
    }

    private fun datePicker() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{view, myear, mmonth, mday ->
            tvDate.text = "$mday/${mmonth + 1}/$myear"
        }, year, month, day).show()
    }
}