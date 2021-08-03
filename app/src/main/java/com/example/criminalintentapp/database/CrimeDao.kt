package com.example.criminalintentapp.database

import androidx.room.Query
import com.example.criminalintentapp.model.Crime
import java.util.*

/**
 * Crime DAO class is a data access object used to retrieve data from the CrimeDatabase class
 */
interface CrimeDao {

    @Query("SELECT * FROM crime")
    fun getCrimes(): List<Crime>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): Crime?

}