package com.example.buynow.data.local.room.Card

import androidx.lifecycle.LiveData

class CardRepo(private val cardDao: CardDao) {

    val allCards: LiveData<List<CardEntity>> = cardDao.getAll()

    suspend fun insert(cardEntity: CardEntity) {
        cardDao.insert(cardEntity)
    }
    suspend fun delete(cardEntity: CardEntity) {
        cardDao.delete(cardEntity)
    }
    suspend fun update(cardEntity: CardEntity) {
        cardDao.update(cardEntity)
    }
}