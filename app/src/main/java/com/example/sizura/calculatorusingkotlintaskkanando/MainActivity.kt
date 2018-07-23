package com.example.sizura.calculatorusingkotlintaskkanando

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnpertambahan.setOnClickListener {
            if (valid()) {
                calculate ( "+"
                )
            }
            else tampilAlert ()
        }
        btnpengurangan.setOnClickListener {
            if (valid()){
                calculate("-"
                )
            }
            else tampilAlert()
        }
        btnperkalian.setOnClickListener {
            if (valid()){
                calculate("*"
                )
            }
            else tampilAlert()
        }
        btnpembagian.setOnClickListener {
            if (valid()){
                calculate("/"
                )
            }
            else tampilAlert()
        }
        btnhapus.setOnClickListener {
            hasil.text = ""
            angka1.text = null
            angka2.text = null
        }
    }

    private fun tampilAlert() {
        val alert = android.app.AlertDialog.Builder (this)
        alert.setTitle("this is alert")
        alert.setPositiveButton("yes", { dialogInterface, i ->
        })
        alert.setNegativeButton("cancel", { dialogInterface, i ->
        })
        alert.setNeutralButton("no",{ dialogInterface, i ->
        })
    }

    private fun calculate(s: String) {
        val inputOne = angka1.text.toString().toDouble()
        val inputTwo = angka2.text.toString().toDouble()


        when (s) {
            "+" -> hasil.text = (inputOne + inputTwo).toString()
            "*" -> hasil.text = (inputOne * inputTwo).toString()
            "/" -> hasil.text = (inputOne / inputTwo).toString()
            "-" -> hasil.text = (inputOne - inputTwo).toString()


        }
    }

    private fun valid(): Boolean {
        if (angka1.text.toString() != "" || angka2.text.toString() != ""){
            return true
        } else {
            return false
        }

    }
}
