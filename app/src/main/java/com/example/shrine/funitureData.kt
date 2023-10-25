package com.example.shrine

data class funitureData(
val furnitureImageId: Int,
val furnitureStoreTile: String,
val furnitureStoreDescription: String,
val furnitureImageDescription: String,
)

val furnitureDataSample = listOf(
    funitureData(
        furnitureImageId = R.drawable.photo_1,
        furnitureStoreTile = "Leons",
        furnitureStoreDescription = "Tried and true, great products etc",
        furnitureImageDescription = "Image by leon"
    ),
    funitureData(
        furnitureImageId = R.drawable.photo_2,
        furnitureStoreTile = "Ronoh",
        furnitureStoreDescription = "Tried and true, great products etc",
        furnitureImageDescription = "Image by ronoh"
    )
)