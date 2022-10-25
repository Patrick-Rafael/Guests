package com.example.guests.ui.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.guests.databinding.RowGuestsBinding
import com.example.guests.ui.model.GuestModel
import com.example.guests.ui.view.listener.onGuestListener
import com.example.guests.ui.view.viewholder.GuestViewHolder

class GuestsAdapter : RecyclerView.Adapter<GuestViewHolder>() {


    private var guestList: List<GuestModel> = listOf()
    private lateinit var guestListener: onGuestListener


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuestViewHolder {
        val item = RowGuestsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GuestViewHolder(item, guestListener)
    }

    override fun onBindViewHolder(holder: GuestViewHolder, position: Int) {
        holder.bind(guestList[position])
    }
    override fun getItemCount(): Int {
        return guestList.count()
    }

    fun updateGuests(list: List<GuestModel>) {
        guestList = list
        notifyDataSetChanged()
    }

    fun attachListener(listener: onGuestListener) {
        guestListener = listener
    }

}