package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.MyAppDataShopping

object shoppingDatasource {

    val default =         MyAppDataShopping(
        R.string.ca3,
        R.string.shopping1,
        R.string.shopping1_des,
        R.drawable.shopping1
    )

    val shoppingList = listOf(
        MyAppDataShopping(
            R.string.ca3,
            R.string.shopping1,
            R.string.shopping1_des,
            R.drawable.shopping1
        ),
        MyAppDataShopping(
            R.string.ca3,
            R.string.shopping2,
            R.string.shopping2_des,
            R.drawable.shopping2
        ),
        MyAppDataShopping(
        R.string.ca3,
        R.string.shopping3,
        R.string.shopping1_des,
        R.drawable.shopping3
    )
    )
}