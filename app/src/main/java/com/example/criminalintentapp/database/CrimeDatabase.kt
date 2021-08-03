package com.example.criminalintentapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.criminalintentapp.model.Crime

@Database(entities = [ Crime::class ], version = 1)
@TypeConverters(CrimeTypeConverter::class)
abstract class CrimeDatabase : RoomDatabase() {

    // Creating CrimeDao interface
    abstract fun crimeDao(): CrimeDao

}