package com.example.criminalintentapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Crime(
    @PrimaryKey val id: UUID = UUID.randomUUID(),
    @ColumnInfo(name = "crime_title") var title: String = "",
    @ColumnInfo(name = "date") var date: Date = Date(),
    var isSolved: Boolean = false
)

