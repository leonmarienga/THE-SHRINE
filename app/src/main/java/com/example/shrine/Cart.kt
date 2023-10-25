package com.example.shrine

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shrine.ui.theme.ShrineTheme

@Composable
fun Cart(){
    Surface(){
        Column(Modifier.fillMaxSize()) {
            val cartSize = 6
            Row(verticalAlignment = Alignment.CenterVertically){
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = "Keyboard down arrow")
                }
                Spacer(Modifier.width(4.dp))
                Text(text = "Hello cart".uppercase())
                Spacer(Modifier.width(12.dp))
                Text(text = "$cartSize items".uppercase())
            }

            SampleItemsData.forEach { items ->

            Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
                IconButton(onClick = { /*TODO*/ },
                Modifier.padding(4.dp)) {
                    Icon(imageVector = Icons.Default.Info, contentDescription = "Remove icon button")
                }

                Column(Modifier.fillMaxWidth()){
                    Divider(color = MaterialTheme.colors.onSurface.copy(alpha = 0.4f))
                    Row(Modifier.padding(vertical = 20.dp),
                    verticalAlignment = Alignment.CenterVertically){
Column(Modifier.padding(end=16.dp)){
Row(Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceBetween){
    Image(painterResource(id =items.photoResId ),
    contentDescription = null,
    contentScale = ContentScale.Crop)
    Text(text="vendor ${items.vendor}".uppercase(),
        style=MaterialTheme.typography.body1)
    Text(text="price ${items.price}".uppercase(),
        style=MaterialTheme.typography.body1)
}
    Text(text="Title",
        style=MaterialTheme.typography.subtitle1)
}
                    }

                }

            }}

            Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 16.dp)
                ) {

                Text(text = "Hello cart".uppercase())
            }
        }
    }

}

@Preview
@Composable
fun CartPreview(){
    ShrineTheme {
        Cart()
    }
}