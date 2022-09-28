package com.example.guests.ui.repository

class GuestRepository private constructor() {


    //Singleton - Controlador de instancias, controle de aceeso
    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(): GuestRepository {

            if (!Companion::repository.isInitialized) {
                repository = GuestRepository()
            }

            return repository
        }
    }


}