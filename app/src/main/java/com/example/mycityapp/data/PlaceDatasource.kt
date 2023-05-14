package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.MyAppDataPlace

object PlaceDatasource {

    val default =         MyAppDataPlace(
        R.string.ca2,
        R.string.place1,
        R.string.place1_des,
        R.drawable.place1
    )

    val placeList = listOf(
        MyAppDataPlace(
            R.string.ca2,
            R.string.place1,
            R.string.place1_des,
            R.drawable.place1
        ),
        MyAppDataPlace(
            R.string.ca2,
            R.string.place2,
            R.string.place2_des,
            R.drawable.place2
        ),
        MyAppDataPlace(
            R.string.ca2,
            R.string.place3,
            R.string.place3_des,
            R.drawable.place3
        ),
        MyAppDataPlace(
            R.string.ca2,
            R.string.place4,
            R.string.place4_des,
            R.drawable.place4
        ),
        MyAppDataPlace(
            R.string.ca2,
            R.string.place5,
            R.string.place5_des,
            R.drawable.place5
        ),
    )
}