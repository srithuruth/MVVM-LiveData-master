package com.example.mvvm_livedata

import android.arch.lifecycle.Observer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultObserver = Observer<String> {
            tvResult.text = it
        }

        val viewModel = CalculatorViewModel()
        viewModel.result.observe(this, resultObserver)

        btnAdd.setOnClickListener {
            viewModel.add(etNumberOne.text.toString(),
                etNumberTwo.text.toString())
        }

        btnSubtract.setOnClickListener {
            viewModel.subtract(etNumberOne.text.toString(),
                etNumberTwo.text.toString())
        }

        btnMultiply.setOnClickListener {
            viewModel.multiply(etNumberOne.text.toString(),
                etNumberTwo.text.toString()) }

        btnDivide.setOnClickListener {
            viewModel.divide(etNumberOne.text.toString(),
                etNumberTwo.text.toString()) }
    }
}
