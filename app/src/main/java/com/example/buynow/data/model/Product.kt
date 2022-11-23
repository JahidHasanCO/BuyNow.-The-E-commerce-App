package com.example.buynow.data.model

data class Product (
    val productName:String = "",
    val productId:String = "",
    val productPrice:String = "",
    val productDes:String = "",
    val productRating: Float = 0.0F,
    val productDisCount:String = "",
    val productHave:Boolean = false,
    val productBrand:String = "",
    val productImage:String = "",
    val productCategory:String = "",
    val productNote:String = "",
)