package com.example.guests.ui.repository


import android.content.Context
import com.example.guests.ui.model.GuestModel

class GuestRepository(context: Context) {

    // Acesso ao banco de dados
    private var guestDataBase = GuestDataBase.getDataBase(context).guestDAO()


    fun get(id: Int): GuestModel {

        return guestDataBase.get(id)
    }


    fun save(guest: GuestModel): Boolean {
        return guestDataBase.save(guest) > 0

    }

    fun getAll(): List<GuestModel> {
        return guestDataBase.getAll()
    }


    fun getPresent(): List<GuestModel> {
        return guestDataBase.getPresent()
    }


    fun getAbsent(): List<GuestModel> {
        return guestDataBase.getAbsent()
    }


    fun update(guest: GuestModel): Boolean {

        return guestDataBase.update(guest) > 0
    }


    fun delete(id: Int) {
        val guest = get(id)
        guestDataBase.delete(guest)
    }


}