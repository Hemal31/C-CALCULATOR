package com.example.c_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

annotation class override

class MainActivity : AppCompatActivity() {
    Button btnConvert;
    EditText etmiles,etfeets,etinches;
    TextView tvResult;
    checkbox cbmeters;
    float result;
    @override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}