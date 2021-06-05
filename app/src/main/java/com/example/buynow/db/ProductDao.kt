package com.example.buynow.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ProductDao {

    @Query("SELECT * FROM cart_items ORDER BY id Desc")
    fun getAll(): LiveData<List<ProductEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(vararg product: ProductEntity)

    @Delete
    suspend fun delete(movie: ProductEntity)

    @Update
    suspend fun update(vararg movies: ProductEntity)
}