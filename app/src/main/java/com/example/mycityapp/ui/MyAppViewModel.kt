package com.example.mycityapp.ui

import com.example.mycityapp.model.MyAppDataFood
import com.example.mycityapp.model.MyAppDataPlace
import com.example.mycityapp.model.MyAppDataShopping
import com.example.mycityapp.model.category
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class MyAppViewModel {

    private val _uiState = MutableStateFlow(MyAppUiState())
    val uiState: StateFlow<MyAppUiState> = _uiState

    //model의 클래스 틀
    fun updateCurrentCategory(category:category){
        _uiState.update {
            currentCategory -> currentCategory.copy(
            currentCategory = category,
            )
        }
    }
    fun updateCurrentFood(food:MyAppDataFood){
        _uiState.update {
                currentFood -> currentFood.copy(
            currentFood = food,
            isShowingHomepage = false
        )
        }
    }
    fun updateCurrentPlace(place:MyAppDataPlace){
        _uiState.update {
                currentPlace -> currentPlace.copy(
            currentPlace = place,
            isShowingHomepage = false
        )
        }
    }
    fun updateCurrentShopping(shopping:MyAppDataShopping){
        _uiState.update {
                currentCategory -> currentCategory.copy(
            currentShopping = shopping,
            isShowingHomepage = false
        )
        }
    }

    }
