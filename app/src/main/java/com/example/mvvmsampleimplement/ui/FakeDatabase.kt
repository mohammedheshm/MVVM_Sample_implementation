package com.example.mvvmsampleimplement.ui

import com.example.mvvmsampleimplement.model.User

class FakeDatabase {


    fun getUserInfoFromDatabase(): User {

        return User("Hi, Mohammed Hesham", 1998)
    }


}