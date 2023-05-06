package com.example.mvvmsampleimplement.ui

import com.example.mvvmsampleimplement.model.Letters

class FakeApiServices {


    val letterList = listOf<Letters>(
        Letters("m", "2023/8/7"),
        Letters("l", "2023/10/7"),
        Letters("k", "2023/11/7"),
        Letters("j", "2023/8/5"),
        Letters("h", "2023/7/4"),
        Letters("g", "2023/2/7"),
        Letters("f", "2023/5/7"),
        Letters("d", "2023/8/7"),
        Letters("s", "2023/8/7"),
        Letters("a", "2023/8/7"),
        Letters("p", "2023/11/21"),
        Letters("o", "2023/8/23"),
        Letters("q", "2023/8/4"),
        Letters("u", "2023/8/22"),
        Letters("y", "2023/8/11"),
        Letters("t", "2023/8/6"),
        Letters("r", "2023/8/7"),
        Letters("e", "2023/8/7"),
        Letters("w", "2023/3/4"),
        Letters("q", "2023/10/7"),
    )


    fun getRandomLetters(): Letters {

        val random = (Math.random() * letterList.size).toInt()
        return letterList[random]
    }

}