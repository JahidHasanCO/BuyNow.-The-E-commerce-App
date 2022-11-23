package com.example.buynow.data.local.room.Card

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.buynow.data.local.room.AppDatabase

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CardViewModel(application: Application): AndroidViewModel(application) {

    private val repository: CardRepo
    val allCards: LiveData<List<CardEntity>>

    init {
        val cardDao = AppDatabase.getInstance(application).cardDao()
        repository = CardRepo(cardDao)
        allCards = repository.allCards
    }

    fun insert(cardEntity: CardEntity) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(cardEntity)
    }

    fun deleteCart(cardEntity: CardEntity) = viewModelScope.launch(Dispatchers.IO) {
        repository.delete(cardEntity)
    }

    fun updateCart(cardEntity: CardEntity) = viewModelScope.launch(Dispatchers.IO) {
        repository.update(cardEntity)
    }
}