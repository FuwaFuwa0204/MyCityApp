package com.example.mycityapp.ui

import androidx.lifecycle.ViewModel
import com.example.mycityapp.model.MyAppDataFood
import com.example.mycityapp.model.category
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class MyAppViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(MyAppUiState())
    val uiState: StateFlow<MyAppUiState> = _uiState

    //model의 클래스 틀
    fun updateCurrentCategory(newCategory: category){
        val previousCategory = uiState.value.currentCategory
        _uiState.update {
                previousCategory -> previousCategory.copy(
            currentCategory = newCategory
                )
        }
    }
    fun updateCurrentItem(newItem:MyAppDataFood){
        val previousItem = uiState.value.currentItem
        _uiState.update {
               previousItem -> previousItem.copy(
            currentItem = newItem
        )
        }
    }


    }
