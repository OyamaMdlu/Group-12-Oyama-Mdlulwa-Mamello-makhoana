package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import com.example.empoweingthenation.ContactUsActivity
import com.example.empoweingthenation.R
import com.example.empoweingthenation.SixMonthCoursesActivity
import com.example.empoweingthenation.SixWeekCoursesActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up toolbar with logo
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Empowering the Nation"

        // Button navigations
        findViewById<Button>(R.id.btn_six_month_courses).setOnClickListener {
            startActivity(Intent(this, SixMonthCoursesActivity::class.java))
        }
        findViewById<Button>(R.id.btn_six_week_courses).setOnClickListener {
            startActivity(Intent(this, SixWeekCoursesActivity::class.java))
        }
        findViewById<Button>(R.id.btn_calculate_fees).setOnClickListener {
            startActivity(Intent(this, FeeCalculatorActivity::class.java))
        }
        findViewById<Button>(R.id.btn_contact_us).setOnClickListener {
            startActivity(Intent(this, ContactUsActivity::class.java))
        }
    }
}
