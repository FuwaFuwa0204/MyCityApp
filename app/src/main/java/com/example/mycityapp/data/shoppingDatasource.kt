package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.MyAppDataFood


object shoppingDatasource {

    val default =         MyAppDataFood(
        R.string.shopping1,
        R.string.shopping1_des,
        R.drawable.shopping1
    )

    val shoppingList = listOf(
        MyAppDataFood(
            R.string.shopping1,
            R.string.shopping1_des,
            R.drawable.shopping1
        ),
        MyAppDataFood(
            R.string.shopping2,
            R.string.shopping2_des,
            R.drawable.shopping2
        ),
        MyAppDataFood(
        R.string.shopping3,
        R.string.shopping1_des,
        R.drawable.shopping3
    )
    )
}