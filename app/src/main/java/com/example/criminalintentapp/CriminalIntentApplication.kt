package com.example.criminalintentapp

import android.app.Application

class CriminalIntentApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // Initializes the CrimeRepository class
        CrimeRepository.initialize(this)
    }
}