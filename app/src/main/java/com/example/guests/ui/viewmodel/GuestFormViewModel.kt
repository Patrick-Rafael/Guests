package com.example.guests.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.guests.ui.model.GuestModel
import com.example.guests.ui.repository.GuestRepository

class GuestFormViewModel(application: Application) : AndroidViewModel(application) {



    // Acesso a dados
    private val repository = GuestRepository(application)

    private val guestModel = MutableLiveData<GuestModel>()
    val saveGuest: LiveData<GuestModel> = guestModel

    private var _guest = MutableLiveData<String>()
    val guest: LiveData<String> = _guest

    /**
     * Salva convidado
     * */
    fun save(guest:GuestModel){


        if(guest.id == 0) {
            if(repository.save(guest)){
                _guest.value = "Inserção com sucesso"
            }else{
                _guest.value = "Falha"

            }


        }else{
            if( repository.update(guest)){
                _guest.value = "Atualização com sucesso"
            }else{
                _guest.value = "Falha"
            }

        }

    }

    /**
     * Carrega convidado
     * */
    fun get(id: Int) {
        guestModel.value = repository.get(id)
    }

}