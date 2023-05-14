package com.example.mycityapp.ui

import com.example.mycityapp.data.PlaceDatasource
import com.example.mycityapp.data.categoryDatasource
import com.example.mycityapp.data.categoryDatasource.categoryList
import com.example.mycityapp.data.foodDatasource
import com.example.mycityapp.data.shoppingDatasource
import com.example.mycityapp.model.MyAppDataFood
import com.example.mycityapp.model.MyAppDataPlace
import com.example.mycityapp.model.MyAppDataShopping
import com.example.mycityapp.model.category

data class MyAppUiState(
    //변수 타입은 model의 MyAppData.kt
    val currentCategory: category = categoryDatasource.default,
    val currentFood: MyAppDataFood = foodDatasource.default,
    val currentPlace: MyAppDataPlace = PlaceDatasource.default,
    val currentShopping:MyAppDataShopping = shoppingDatasource.default,
    val isShowingHomepage:Boolean = true

)
