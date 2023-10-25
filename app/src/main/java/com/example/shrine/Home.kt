package com.example.shrine

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.shrine.ui.theme.ShrineTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Home(){
    Surface() {
        Column(Modifier.fillMaxSize()) {
            TopAppBar(
                title = { Text("Main Page") },
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Default.Home, contentDescription = null)
                    }
                }
            )
            Column(Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly){
                Row(horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp)){
                    Card(){
                        Column(modifier = Modifier.padding(7.dp),
                        horizontalAlignment = Alignment.CenterHorizontally){
                            Image(painterResource(id =R.drawable.real_home_),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(120.dp)
                            )
                            Divider(
                                modifier = Modifier.width(150.dp),
                            color= MaterialTheme.colors.onSurface,
                            thickness = 1.dp
                            )
                            Text(text = "Real Estate".uppercase(),
                                style=MaterialTheme.typography.body1)
                        }
                    }

                    Card(){
                        Column(modifier = Modifier.padding(7.dp),
                            horizontalAlignment = Alignment.CenterHorizontally){
                            Image(painterResource(id =R.drawable.f_home_),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(120.dp)
                            )
                            Divider(
                                modifier = Modifier.width(150.dp),
                                color= MaterialTheme.colors.onSurface,
                                thickness = 1.dp
                            )
                            Text(text = "Furniture stores".uppercase(),
                                style=MaterialTheme.typography.body1)
                        }
                    }

                }

                Row(horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)){
                    Card(){
                        Column(modifier = Modifier.padding(7.dp),
                            horizontalAlignment = Alignment.CenterHorizontally){
                            Image(painterResource(id =R.drawable.l_home_),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(120.dp)
                            )
                            Divider(
                                modifier = Modifier.width(150.dp),
                                color= MaterialTheme.colors.onSurface,
                                thickness = 1.dp
                            )
                            Text(text = "Law firms".uppercase(),
                                style=MaterialTheme.typography.body1)
                        }
                    }

                    Card(){
                        Column(modifier = Modifier.padding(7.dp),
                            horizontalAlignment = Alignment.CenterHorizontally){
                            Image(painterResource(id =R.drawable.rhome),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(120.dp)
                            )
                            Divider(
                                modifier = Modifier.width(150.dp),
                                color= MaterialTheme.colors.onSurface,
                                thickness = 1.dp
                            )
                            Text(text = "Restaurants".uppercase(),
                                style=MaterialTheme.typography.body1)
                        }
                    }

                }

            }
            }

            }
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigationbar(items = listOf(
                BottomNavItem(name="Home",
                route="home",
                icon= Icons.Default.Home),
                BottomNavItem(name="Real Estate",
                    route="realEstate",
                    icon= Icons.Default.LocationOn),
                BottomNavItem(name="Furniture",
                    route="furniture",
                    icon= Icons.Default.Build)
            ), navController = navController, onItemClick = {navController.navigate(it.route)})
        }

    ) {
        Navigation(navController = navController)
    }


        }


@Composable
fun Navigation(navController: NavHostController){
    NavHost(navController= navController, startDestination = "home"){
        composable("home"){
            Home()
        }
        composable("realEstate"){
            realEstate()
        }
        composable("furniture"){
            funiturePage()
        }
    }
}

@Composable
fun BottomNavigationbar(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick:(BottomNavItem)->Unit
){
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomNavigation(
        modifier = modifier
    ) {
        items.forEach{
            item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
                selected = selected,
                onClick = { onItemClick(item)},
                selectedContentColor = Color.Blue,
                unselectedContentColor = Color.Gray,
            icon = {
                Column(horizontalAlignment = CenterHorizontally) {

                        Icon(imageVector = item.icon, contentDescription = item.name)
                    if (selected){
                        Text(text = item.name,
                        textAlign = TextAlign.Center,
                            fontSize = 10.sp)
                    }

                }
            }
            )
        }
    }
}

