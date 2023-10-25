package com.example.shrine

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun realEstate(){
    Column(Modifier.fillMaxSize()){
        TopAppBar(
            title = { Text("Real Estate") },
            navigationIcon = {
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(Icons.Default.Home, contentDescription = null)
                }
            }
        )

        Column() {
            realEstateSiteSample.forEach { items ->
            Row(modifier = Modifier.fillMaxWidth()) {
                Card() {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row(
                            modifier = Modifier.fillMaxWidth()
                                .padding(5.dp)
                        ) {
                            Card() {
                                Image(
                                    painterResource(id = items.photoRealId),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.height(100.dp).width(100.dp)
                                )
                            }

                            Column(modifier = Modifier.padding(10.dp)) {
                                Text(
                                    text = items.realEstateSiteName.uppercase(),
                                    style = MaterialTheme.typography.h5
                                )
                                Divider(
                                    modifier = Modifier.width(150.dp),
                                    color = MaterialTheme.colors.onSurface,
                                    thickness = 1.dp
                                )
                                Text(
                                    text = items.realEstateSiteDescription,
                                    style = MaterialTheme.typography.body2
                                )
                            }
                        }
                        Text(
                            text = items.realEstateSiteImageDescription,
                            style = MaterialTheme.typography.caption
                        )


                    }
                }
            }
        }
        }
    }
}

@Preview
@Composable
fun realEstatePreview(){
    realEstate()
}


