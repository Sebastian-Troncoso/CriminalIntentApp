package com.example.criminalintentapp.model

import java.text.DateFormat
import java.util.*

data class Crime(
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: String = DateFormat.getDateTimeInstance().format(Date()),
    var isSolved: Boolean = false
)

