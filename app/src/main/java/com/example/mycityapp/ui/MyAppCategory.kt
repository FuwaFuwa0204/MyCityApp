package com.example.mycityapp.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mycityapp.R
import com.example.mycityapp.data.categoryDatasource.categoryList
import com.example.mycityapp.model.category

@Composable
fun CategoryList(onClickNextPage:()->Unit,
                 onSelectionChanged:(category)->Unit,
                 modifier: Modifier = Modifier){
    
    Spacer(modifier = Modifier.height(25.dp))

    LazyColumn(modifier=modifier.fillMaxSize()){
      items(categoryList){
          CategoryItem(modifier=Modifier.clickable {
              onSelectionChanged(it)
              onClickNextPage()
          }, title = it.category )

      }

    }

}

@Composable
fun CategoryItem(@StringRes title:Int, modifier: Modifier = Modifier) {
    Row(modifier= modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start){
        androidx.compose.material3.Icon(painter = painterResource(id = R.drawable.favorite_48px), contentDescription = null)
        Spacer(modifier = Modifier.width(10.dp))
        Text(stringResource(id = title))

    }
}


