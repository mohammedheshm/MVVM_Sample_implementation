package com.example.mvvmsampleimplement.modelviews

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmsampleimplement.model.Letters
import com.example.mvvmsampleimplement.model.User
import com.example.mvvmsampleimplement.repository.MainRepository

class MainViewModel : ViewModel() {


    private val repository = MainRepository()
    val userName = MutableLiveData<User>()
    val letter = MutableLiveData<Letters>()


    fun getUserName() {
        userName.postValue(repository.getUserInfo())
    }

    fun getLetters() {
        letter.postValue(repository.getRLetters())
    }

}