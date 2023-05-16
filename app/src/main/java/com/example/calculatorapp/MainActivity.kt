package com.example.calculatorapp

import android.icu.number.NumberFormatter.DecimalSeparatorDisplay
import android.icu.number.NumberFormatter.SignDisplay
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var display_results:TextView
    lateinit var first_edt:EditText
    lateinit var second_edt:EditText
    lateinit var btn_add:Button
    lateinit var btn_multiply:Button
    lateinit var btn_divide:Button
    lateinit var btn_sub:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display_results = findViewById(R.id.edtstext)
        first_edt = findViewById(R.id.edtsfirst)
        second_edt = findViewById(R.id.edtssecond)
        btn_add = findViewById(R.id.btnadd)
        btn_multiply = findViewById(R.id.btnmultiply)
        btn_divide = findViewById(R.id.btndivide)
        btn_sub = findViewById(R.id.btnsub)

        btn_add.setOnClickListener {
            var num1 = first_edt.text.toString().trim()
            var num2 = second_edt.text.toString().trim()

            //convert to int or double
            var number1 = num1.toDouble()
            var number2 = num2.toDouble()

            //Results is in double format
            val total = number1 + number2
           //convert back to string
            var string_total = total.toString()
            Toast.makeText(this, "Results is $string_total", Toast.LENGTH_SHORT).show()
        }
        btn_multiply.setOnClickListener {
            var mult1 = first_edt.text.toString().trim()
            var mult2 = second_edt.text.toString().trim()

            //convert to int or double
            var multiply1 = mult1.toDouble()
            var multiply2 = mult2.toDouble()

            //display results
            val total = multiply1 * multiply2
            var string_total = total.toString()
            Toast.makeText(this, "Results is$string_total", Toast.LENGTH_SHORT).show()
        }
        btn_divide.setOnClickListener {
            var div1 = first_edt.text.toString().trim()
            var div2 = second_edt.text.toString().trim()

            //convert to int or double
            var divide1 = div1.toDouble()
            var divide2 = div2.toDouble()

            //display results
            val total = divide1 / divide2
            var string_total = total.toString()
            Toast.makeText(this, "Results is $string_total", Toast.LENGTH_SHORT).show()
        }
        btn_sub.setOnClickListener {
            var sub1 = first_edt.text.toString().trim()
            var sub2 = second_edt.text.toString().trim()

            //convert to int or double
            var subtract1 = sub1.toDouble()
            var subtract2 = sub2.toDouble()

            //display results
            val results = subtract1 - subtract2
            var string_total = results.toString()
            Toast.makeText(this, "Results is $string_total", Toast.LENGTH_SHORT).show()
        }
    }
}