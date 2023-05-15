package com.example.mycityapp.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mycityapp.R
import com.example.mycityapp.data.PlaceDatasource.placeList
import com.example.mycityapp.data.foodDatasource.foodList
import com.example.mycityapp.data.shoppingDatasource.shoppingList
import com.example.mycityapp.model.MyAppDataFood
import com.example.mycityapp.model.category

@Composable
fun recommend(uiState: MyAppUiState,
              viewModel: MyAppViewModel = viewModel(),
              onClickNextPage:()->Unit,
              onSelectionChanged:(MyAppDataFood)->Unit,
              modifier: Modifier= Modifier){

    val uiState = uiState
    val viewModel: MyAppViewModel = viewModel()

    when(uiState.currentCategory){

        category(R.string.ca1) ->
            LazyColumn(modifier=modifier.fillMaxSize() ){
                items(foodList){
                    recommendItem(title = it.recommend,modifier=Modifier.clickable {
                        onSelectionChanged(it)
                        onClickNextPage()

                    })

                }

            }
        category(R.string.ca2) ->
            LazyColumn(modifier=modifier.fillMaxSize() ){
                items(placeList){
                    recommendItem(title = it.recommend,modifier=Modifier.clickable {
                        onSelectionChanged(it)
                        onClickNextPage()

                    })

                }

            }
        category(R.string.ca3) ->
            LazyColumn(modifier=modifier.fillMaxSize() ){
                items(shoppingList){
                    recommendItem(title = it.recommend,modifier=Modifier.clickable {
                        onSelectionChanged(it)
                        onClickNextPage()

                    })

                }

            }


    }

}





@Composable
fun recommendItem(@StringRes title:Int, modifier: Modifier = Modifier){
    Row(modifier=modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start){
        Icon(painter = painterResource(id = R.drawable.favorite_48px), contentDescription = null)
        Spacer(modifier = Modifier.width(10.dp))
        Text(stringResource(id = title))

    }
}


