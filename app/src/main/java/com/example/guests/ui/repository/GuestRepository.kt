package com.example.guests.ui.repository

import android.content.Context

class GuestRepository private constructor(context: Context) {

    private val guestRepository = GuestDataBase(context)

    //Singleton - Controlador de instancias, controle de aceeso
    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {

            if (!Companion::repository.isInitialized) {
                repository = GuestRepository(context)
            }

            return repository
        }
    }

    fun insert(){

        
    }

}