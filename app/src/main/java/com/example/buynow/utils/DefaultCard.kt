package com.example.buynow.utils

import android.app.Activity

import android.content.Context
import android.content.SharedPreferences

object DefaultCard {

    const val DEFAULTCARDNAME = "DefaultCreditCard"


    fun Activity.CreateDefCard(cardNumber:String, boolean: Boolean){

        val defaultCard = getSharedPreferences(DEFAULTCARDNAME, Context.MODE_PRIVATE)
        if(!defaultCard.getBoolean("isHaveDefaultCard",true)){
            val editor:SharedPreferences.Editor =  defaultCard.edit()
            editor.putBoolean("isHaveDefaultCard",boolean)
            editor.putString("cardNumber",cardNumber)
            editor.apply()
        }
    }

    fun Activity.GetDefCard():String{
        var cardNumber: String = ""
        val defaultCard = getSharedPreferences(DEFAULTCARDNAME, Context.MODE_PRIVATE)
        cardNumber = defaultCard.getString("cardNumber","You Have No Cards").toString()
        return cardNumber
    }

}