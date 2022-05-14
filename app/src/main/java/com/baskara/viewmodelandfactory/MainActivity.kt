package com.baskara.viewmodelandfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.baskara.viewmodelandfactory.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory("Counter Result", 999)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)

        binding.apply {
            textTitle.text = viewModel.getTitle()
            textResult.text = viewModel.getResult().toString()

            buttonPlus.setOnClickListener {
                viewModel.setPlus(editInput.text.toString().toInt())
                textResult.text = viewModel.getResult().toString()
            }

            buttonMinus.setOnClickListener {
                viewModel.setMinus(editInput.text.toString().toInt())
                textResult.text = viewModel.getResult().toString()
            }
        }

    }
}