package com.example.shrine

data class ItemData(
    val id: Int,
    val title: String,
    val price: Int,
    val vendor: Vendor,
    val photoResId: Int,
)

enum class Vendor {
    Alphi,
    Lmbrjk,
    Mal,
    Six,
    squiggle,
}

val SampleItemsData = listOf(
    ItemData(
       id = 0,
 title ="Vagabond sack",
price = 120,
vendor= Vendor.squiggle,
photoResId = R.drawable.photo_1,
    ),
    ItemData(
        id = 1,
        title ="Stella sunglasses",
        price = 50,
        vendor= Vendor.Mal,
        photoResId = R.drawable.photo_2,
    ),
    ItemData(
        id = 2,
        title ="Whitney Belt",
        price = 1200,
        vendor= Vendor.Alphi,
        photoResId = R.drawable.photo_3,
    ),
    ItemData(
        id = 3,
        title ="New Mexico",
        price = 1020,
        vendor= Vendor.Lmbrjk,
        photoResId = R.drawable.photo_4,
    ),
    ItemData(
        id = 4,
        title ="The sack",
        price = 1000,
        vendor= Vendor.Six,
        photoResId = R.drawable.photo_5,
    ),
    ItemData(
        id = 5,
        title ="Vagabond",
        price = 2000,
        vendor= Vendor.Alphi,
        photoResId = R.drawable.photo_6,
    ),
    ItemData(
        id = 6,
        title ="Boschuazzee",
        price = 4000,
        vendor= Vendor.Six,
        photoResId = R.drawable.photo_7,
    ),
    ItemData(
        id = 7,
        title ="Be expensive",
        price = 4000000,
        vendor= Vendor.Mal,
        photoResId = R.drawable.photo_8,
    ),
    ItemData(
        id = 8,
        title ="Keep Buying",
        price = 40000,
        vendor= Vendor.Six,
        photoResId = R.drawable.photo_9,
    )

)