package com.example.mycityapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class category (
    @StringRes val category:Int,
)

data class MyAppDataFood (
    @StringRes val category:Int,
    @StringRes val recommend:Int,
    @StringRes val detail:Int,
    @DrawableRes val image:Int
        )
data class MyAppDataPlace (
    @StringRes val place:Int,
    @StringRes val recommend:Int,
    @StringRes val detail:Int,
    @DrawableRes val image:Int
)
data class MyAppDataShopping (
    @StringRes val shopping:Int,
    @StringRes val recommend:Int,
    @StringRes val detail:Int,
    @DrawableRes val image:Int
)