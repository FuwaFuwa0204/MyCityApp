package com.example.mycityapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.example.mycityapp.model.MyAppDataFood


@Composable
fun detailImage(uiState: MyAppUiState,modifier:Modifier= Modifier){

    when(uiState.currentItem){
        MyAppDataFood(recommend = R.string.food1, detail = R.string.food1_des, image = R.drawable.food1)
        ->foodImage(uiState = MyAppDataFood(recommend = R.string.food1, detail = R.string.food1_des, image = R.drawable.food1))
    MyAppDataFood(recommend = R.string.food2, detail = R.string.food2_des, image = R.drawable.food2)
    ->foodImage(uiState = MyAppDataFood(recommend = R.string.food2, detail = R.string.food2_des, image = R.drawable.food2))
    MyAppDataFood(recommend = R.string.food3, detail = R.string.food3_des, image = R.drawable.food3)
    ->foodImage(uiState = MyAppDataFood(recommend = R.string.food3, detail = R.string.food3_des, image = R.drawable.food3))
    MyAppDataFood(recommend = R.string.food4, detail = R.string.food4_des, image = R.drawable.food4)
    ->foodImage(uiState = MyAppDataFood(recommend = R.string.food4, detail = R.string.food4_des, image = R.drawable.food4))
    MyAppDataFood(recommend = R.string.food5, detail = R.string.food5_des, image = R.drawable.food5)
    ->foodImage(uiState = MyAppDataFood(recommend = R.string.food5, detail = R.string.food5_des, image = R.drawable.food5))


        MyAppDataFood(
            recommend = R.string.place1,
            detail = R.string.place1_des,
            image = R.drawable.place1
        ) -> placeImage(
            uiState =   MyAppDataFood(
                recommend = R.string.place1,
                detail = R.string.place1_des,
                image = R.drawable.place1
            )
        )

        MyAppDataFood(
            recommend = R.string.place2,
            detail = R.string.place2_des,
            image = R.drawable.place2
        ) -> placeImage(
            uiState =   MyAppDataFood(
                recommend = R.string.place2,
                detail = R.string.place2_des,
                image = R.drawable.place2
            )
        )

        MyAppDataFood(
            recommend = R.string.place3,
            detail = R.string.place3_des,
            image = R.drawable.place3
        ) -> placeImage(
            uiState =   MyAppDataFood(
                recommend = R.string.place3,
                detail = R.string.place3_des,
                image = R.drawable.place3
            )
        )

        MyAppDataFood(
            recommend = R.string.place4,
            detail = R.string.place4_des,
            image = R.drawable.place4
        ) -> placeImage(
            uiState =   MyAppDataFood(
                recommend = R.string.place4,
                detail = R.string.place4_des,
                image = R.drawable.place4
            )
        )

        MyAppDataFood(
            recommend = R.string.place5,
            detail = R.string.place5_des,
            image = R.drawable.place5
        ) -> placeImage(
            uiState =   MyAppDataFood(
                recommend = R.string.place5,
                detail = R.string.place5_des,
                image = R.drawable.place5
            )
        )


        MyAppDataFood(recommend = R.string.shopping1, detail = R.string.shopping1_des, image = R.drawable.shopping1)
        -> shoppingImage(uiState = MyAppDataFood(recommend = R.string.shopping1, detail = R.string.shopping1_des, image = R.drawable.shopping1))
        MyAppDataFood(recommend = R.string.shopping2, detail = R.string.shopping2_des, image = R.drawable.shopping2)
        -> shoppingImage(uiState =MyAppDataFood(recommend = R.string.shopping2, detail = R.string.shopping2_des, image = R.drawable.shopping2))
        MyAppDataFood(recommend = R.string.shopping3, detail = R.string.shopping3_des, image = R.drawable.shopping3)
        -> shoppingImage(uiState = MyAppDataFood(recommend = R.string.shopping3, detail = R.string.shopping3_des, image = R.drawable.shopping3))

    }

}

@Composable
fun foodImage(uiState: MyAppDataFood,modifier: Modifier=Modifier) {

    Card(modifier = Modifier,
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(4.dp)) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = uiState.image),
            contentDescription = null,
            modifier = Modifier
                .padding(10.dp)
                .width(400.dp)
                .height(400.dp)
        )
        Text(stringResource(id = uiState.detail), modifier=Modifier.padding(10.dp))
        Spacer(Modifier.height(20.dp))

    }
}
}

@Composable
fun placeImage(uiState: MyAppDataFood,modifier: Modifier=Modifier) {

    Card(
        modifier = Modifier,
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = uiState.image),
                contentDescription = null,
                modifier = Modifier
                    .padding(10.dp)
                    .width(400.dp)
                    .height(400.dp)
            )
            Text(stringResource(id = uiState.detail))
            Spacer(Modifier.height(20.dp))
        }

    }
}
@Composable
fun shoppingImage(uiState: MyAppDataFood,modifier: Modifier=Modifier) {

    Card(
        modifier = Modifier,
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = uiState.image), contentDescription = null,
                modifier = Modifier
                    .padding(10.dp)
                    .width(400.dp)
                    .height(400.dp)
            )
            Text(stringResource(id = uiState.detail))
            Spacer(Modifier.height(20.dp))
        }

    }
}

