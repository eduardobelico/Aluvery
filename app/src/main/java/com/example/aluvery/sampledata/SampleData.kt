package com.example.aluvery.sampledata

import com.example.aluvery.R
import com.example.aluvery.model.Product
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Hambúrger",
        price = BigDecimal("12.99"),
        image = R.drawable.burger
    ),
    Product(
        name = "Batata Frita",
        price = BigDecimal("7.99"),
        image = R.drawable.fries
    ),
    Product(
        name = "Pizza",
        price = BigDecimal("19.99"),
        image = R.drawable.pizza
    )
)
