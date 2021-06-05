package com.example.buynow.db

import androidx.lifecycle.LiveData

class CartRepo(private val productDao: ProductDao) {

    val allCartProducts: LiveData<List<ProductEntity>> = productDao.getAll()

    suspend fun insert(product: ProductEntity) {
        productDao.insert(product)
    }
}