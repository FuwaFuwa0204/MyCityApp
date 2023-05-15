package com.example.mycityapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.mycityapp.R

data class category (
    @StringRes val category:Int,
)

data class MyAppDataFood (
    //이름
    @StringRes val recommend:Int,
    @StringRes val detail:Int,
    @DrawableRes val image:Int
        )
/*
data class MyAppDataPlace (
    @StringRes val recommend:Int,
    @StringRes val detail:Int,
    @DrawableRes val image:Int
)
data class MyAppDataShopping (
    @StringRes val recommend:Int,
    @StringRes val detail:Int,
    @DrawableRes val image:Int
)
*/
