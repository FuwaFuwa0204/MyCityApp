package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.MyAppDataFood

object foodDatasource {
    val default = MyAppDataFood(
        R.string.ca1,
        R.string.food1,
        R.string.food1_des,
        R.drawable.food1
    )
    val categoryList = listOf(
        MyAppDataFood(
             R.string.ca1,
            R.string.food1,
            R.string.food1_des,
            R.drawable.food1
        ),
        MyAppDataFood(
            R.string.ca1,
            R.string.food2,
            R.string.food2_des,
            R.drawable.food2
        ),
        MyAppDataFood(
            R.string.ca1,
            R.string.food3,
            R.string.food3_des,
            R.drawable.food3
        ),
        MyAppDataFood(
            R.string.ca1,
            R.string.food4,
            R.string.food4_des,
            R.drawable.food4
        ),
        MyAppDataFood(
            R.string.ca1,
            R.string.food5,
            R.string.food5_des,
            R.drawable.food5
        ),

    )
}