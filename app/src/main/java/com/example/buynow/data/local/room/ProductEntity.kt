package com.example.buynow.data.local.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cart_items")
data class ProductEntity (
    @ColumnInfo(name = "Product_Name") var name: String,
    @ColumnInfo(name = "Product_Quantity") var qua: Int,
    @ColumnInfo(name = "Product_Price") var price: Int,
    @ColumnInfo(name = "Product_ID") var pId: String,
    @ColumnInfo(name = "Product_Image") var Image: String,

        ){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}