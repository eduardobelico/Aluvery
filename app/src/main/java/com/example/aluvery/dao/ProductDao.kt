package com.example.aluvery.dao

import com.example.aluvery.model.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ProductDao {
    
    companion object {
        private val products = MutableStateFlow<List<Product>>(emptyList())
    }
    
    fun products() = products.asStateFlow()
//    fun products(): StateFlow<List<Product>> = products
    
    fun save(product: Product) {
        products.value = products.value + product
    }
    
}