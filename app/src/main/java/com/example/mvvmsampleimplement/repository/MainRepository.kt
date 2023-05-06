package com.example.mvvmsampleimplement.repository

import com.example.mvvmsampleimplement.ui.FakeApiServices
import com.example.mvvmsampleimplement.ui.FakeDatabase

class MainRepository {

    private val api = FakeApiServices()
    private val database = FakeDatabase()


    fun getUserInfo() = database.getUserInfoFromDatabase()
    fun getRLetters() = api.getRandomLetters()
}