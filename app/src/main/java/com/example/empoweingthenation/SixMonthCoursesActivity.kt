package com.example.empoweingthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SixMonthCoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_month_courses)

        // Course detail navigation
        findViewById<Button>(R.id.btn_first_aid).setOnClickListener {
            startActivity(Intent(this, FirstAidCourseActivity::class.java))
        }
        findViewById<Button>(R.id.btn_sewing).setOnClickListener {
            startActivity(Intent(this, SewingCourseActivity::class.java))

        }
    }
}