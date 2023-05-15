package com.example.mycityapp.ui


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycityapp.R
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


enum class MyAppEnum(){

    Category,
    Recommend,
    Detail

}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(
    modifier: Modifier = Modifier,
    viewModel: MyAppViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){
    val navController = rememberNavController()
    //val backStackEntry by navController.currentBackStackEntryAsState()
    //val currentScreen = MyAppEnum.valueOf(
       // backStackEntry?.destination?.route ?: MyAppEnum.Category.name
   // )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        stringResource(id = R.string.app_name)
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.Favorite,
                            contentDescription = "Localized description"
                        )
                    }
                }
            )
        },
        content = { innerPadding ->
           val uiState by viewModel.uiState.collectAsState()
            
            NavHost(
                navController = navController,
                startDestination = MyAppEnum.Category.name,
                modifier = Modifier.padding(innerPadding) )
            {
                composable(route= MyAppEnum.Category.name){
                    CategoryList(
                        onSelectionChanged = {
                            viewModel.updateCurrentCategory(it)
                        },
                        onClickNextPage = {
                            navController.navigate(MyAppEnum.Recommend.name)
                        },
                    )
                }
                composable(route= MyAppEnum.Recommend.name){
                    
                    recommend(
                        
                        onSelectionChanged = {
                            viewModel.updateCurrentItem(it)
                                             
                        },
                        onClickNextPage = {
                            navController.navigate(MyAppEnum.Detail.name)
                        },
                        viewModel = viewModel,
                        uiState = uiState
                    )

                }
                composable(route= MyAppEnum.Detail.name){
                    detailImage(uiState = uiState)
               
                }

            }
        }
    )

}

@Preview
@Composable
fun MyAppPreview(){
    //필수로 넣어주기!
    val navController:NavHostController = rememberNavController()
    MyApp(navController = navController)
}

