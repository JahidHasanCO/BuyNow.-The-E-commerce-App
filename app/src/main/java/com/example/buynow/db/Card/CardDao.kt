package com.example.buynow.db.Card

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.buynow.db.ProductEntity

@Dao
interface CardDao {

    @Query("SELECT * FROM card_list order by id asc")
    fun getAll(): LiveData<List<CardEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(vararg card: CardEntity)

    @Delete
    suspend fun delete(card: CardEntity)

    @Update
    suspend fun update(vararg card: CardEntity)
}