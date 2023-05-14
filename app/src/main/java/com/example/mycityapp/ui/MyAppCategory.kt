package com.example.mycityapp.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import com.example.mycityapp.R
import com.example.mycityapp.data.categoryDatasource.categoryList
import com.example.mycityapp.model.category

@Composable
fun CategoryList(modifier: Modifier = Modifier){

    LazyColumn(modifier=modifier){
      items(categoryList){
          CategoryItem(title = it.category)
      }

    }

}

@Composable
fun CategoryItem(@StringRes title:Int, modifier: Modifier = Modifier){
    Row(modifier=modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically){
        androidx.compose.material3.Icon(painter = painterResource(id = R.drawable.favorite_48px), contentDescription = null)
        Spacer(modifier = Modifier.width(10.dp))
        Text(stringResource(id = title))

    }
}

@Composable
@Preview
fun CategoryPreview(){
    CategoryList()

}