package com.example.mvvmsampleimplement.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmsampleimplement.R
import com.example.mvvmsampleimplement.databinding.ActivityMainBinding
import com.example.mvvmsampleimplement.modelviews.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        setUp()

    }

    private fun setUp() {
        viewModel.getUserName()
        binding.btnFetchLetter.setOnClickListener {
            viewModel.getLetters()
        }

        viewModel.userName.observe(this) {
            binding.tvUsername.text = it.currenUser
        }

        viewModel.letter.observe(this) {
            binding.apply {
                tvDate.text = it.data
                tvLetter.text = it.letter
            }
        }
    }
}