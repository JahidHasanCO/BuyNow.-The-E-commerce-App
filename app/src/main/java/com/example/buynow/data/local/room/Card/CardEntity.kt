package com.example.buynow.data.local.room.Card

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Card_List")
class CardEntity (

    @ColumnInfo(name = "CardHolder_Name") var nameCH: String,
    @ColumnInfo(name = "Card_Number") var number: String,
    @ColumnInfo(name = "Card_Exp") var exp: String,
    @ColumnInfo(name = "Card_cvv") var cvv: String,
    @ColumnInfo(name = "Card_Brand") var brandC: String,
        )
{
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}