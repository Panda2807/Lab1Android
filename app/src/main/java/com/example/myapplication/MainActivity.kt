package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var input1: EditText
    lateinit var input2: EditText
    lateinit var res1: TextView
    lateinit var res2: TextView

            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    button = findViewById(R.id.Sum)
    input1 = findViewById(R.id.Num1)
    input2 = findViewById(R.id.Num2)
    res1 = findViewById(R.id.Result)
    res2 = findViewById(R.id.Result1)

    button.setOnClickListener{

        val a = input1.text.toString().toInt()
        val b = input2.text.toString().toInt()

        res1.text = (a + b).toString()
        res2.text = (a - b).toString()

    }
    }
}