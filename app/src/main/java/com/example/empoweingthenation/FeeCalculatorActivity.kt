package com.example.empoweringthenation

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.empoweingthenation.R

class FeeCalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fee_calculator)

        val cbFirstAid = findViewById<CheckBox>(R.id.cb_first_aid)
        val cbSewing = findViewById<CheckBox>(R.id.cb_sewing)
        val cbLandscaping = findViewById<CheckBox>(R.id.cb_landscaping)
        val cbLifeSkills = findViewById<CheckBox>(R.id.cb_lifeskills)

        val btnCalculate = findViewById<Button>(R.id.btn_calculate)
        val tvResult = findViewById<TextView>(R.id.tv_result)

        btnCalculate.setOnClickListener {
            val selectedCourses = mutableListOf<String>()
            if (cbFirstAid.isChecked) selectedCourses.add("First Aid")
            if (cbSewing.isChecked) selectedCourses.add("Sewing")
            if (cbLandscaping.isChecked) selectedCourses.add("Landscaping")
            if (cbLifeSkills.isChecked) selectedCourses.add("Life Skills")

            val totalFee = calculateTotalFee(selectedCourses.size)
            tvResult.text = "Total Fee (with VAT): R$totalFee"
        }
    }

    private fun calculateTotalFee(courseCount: Int): Double {
        val baseFee = 1500
        val discountRate = when (courseCount) {
            2 -> 0.05
            3 -> 0.10
            else -> if (courseCount > 3) 0.15 else 0.0
        }
        val total = baseFee * courseCount * (1 - discountRate)
        return total * 1.15 // Adding 15% VAT
    }
}
