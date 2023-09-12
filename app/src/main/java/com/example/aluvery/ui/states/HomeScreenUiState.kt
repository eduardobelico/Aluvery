package com.example.aluvery.ui.states

import com.example.aluvery.model.Product

data class HomeScreenUiState(
    val sections: Map<String, List<Product>> = emptyMap(),
    val searchedProducts: List<Product> = emptyList(),
    val searchText: String = "",
    val onSearchChange: (String) -> Unit = {}
) {
    
    fun isShownSections(): Boolean {
        return searchText.isBlank()
    }
}