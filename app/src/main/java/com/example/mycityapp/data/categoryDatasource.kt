package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.category

object categoryDatasource {
    val default = category(R.string.ca1)
    val categoryList = listOf(
        category(R.string.ca1),
        category(R.string.ca2),
        category(R.string.ca3)
    )
}