package com.example.guests.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.guests.ui.GuestModel
import com.example.guests.ui.repository.GuestRepository

class AllGuestsViewModel(application: Application) : AndroidViewModel(application) {


    private val repostitory = GuestRepository.getInstance(application.applicationContext)

    private val listAllGuests = MutableLiveData<List<GuestModel>>()
    val guests: LiveData<List<GuestModel>> = listAllGuests



    fun getAll(){

        listAllGuests.value = repostitory.getAll()
    }


}


