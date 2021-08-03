package com.example.criminalintentapp

import android.content.Context
import androidx.room.Room
import com.example.criminalintentapp.database.CrimeDatabase
import com.example.criminalintentapp.model.Crime
import java.util.*

/**
 * Creating a repository class that encapsulates the logic for accessing data from a source. This
 * is called the repository pattern and is recommended by Google. CrimeRepository is a singleton
 * because there will always be one instance of this class in the entire app process.
 */

private const val DATABASE_NAME = "crime-database"

class CrimeRepository private constructor (context: Context) {

    // creating a database reference to the CrimeDatabase class
    private val database: CrimeDatabase = Room.databaseBuilder(
        context.applicationContext,
        CrimeDatabase::class.java,
        DATABASE_NAME
    ).build()

    private val crimeDao = database.crimeDao()

    // Returns a list of crimes
    fun getCrimes(): List<Crime> = crimeDao.getCrimes()

    // Returns a crime based on id
    fun getCrime(id : UUID): Crime? = crimeDao.getCrime(id)

    companion object {
        private var INSTANCE: CrimeRepository? = null

        fun initialize(context: Context) {
            if(INSTANCE == null) {
                INSTANCE = CrimeRepository(context)
            }
        }

        fun get(): CrimeRepository {
           return INSTANCE?:
           throw IllegalStateException("CrimeRepository must be initialized")
        }
    }
}