package com.example.shrine

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun funiturePage(){
    Column(
        Modifier.fillMaxSize()
    ){
        TopAppBar(
            title = { Text("FURNITURE") },
            navigationIcon = {
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(Icons.Default.Face, contentDescription = null)
                }
            }
        )
        furnitureDataSample.forEach{group2 ->
        Column() {
            Row(){
                Image(
                    painterResource(id = group2.furnitureImageId),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
                )
                Column() {
                    Text(text = group2.furnitureStoreTile)
                    Divider(
                        modifier = Modifier.width(150.dp),
                        color = MaterialTheme.colors.onSurface,
                        thickness = 1.dp
                    )
                    Text(text = group2.furnitureStoreDescription)
                }
            }
            Text(text = group2.furnitureImageDescription)
        }}
    }
}


