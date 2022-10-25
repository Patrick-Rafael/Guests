package com.example.guests.ui.view.viewholder


import android.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.example.guests.R

import com.example.guests.databinding.RowGuestsBinding
import com.example.guests.ui.model.GuestModel
import com.example.guests.ui.view.listener.onGuestListener

class GuestViewHolder(private val item: RowGuestsBinding, private val listener: onGuestListener) :
    RecyclerView.ViewHolder(item.root) {

    fun bind(guest: GuestModel) {

        // Atribui valores
        item.textName.text = guest.name

        // Atribui eventos
        item.textName.setOnClickListener {
            listener.onClick(guest.id)
        }

        // Atribui eventos
        item.textName.setOnLongClickListener {
            AlertDialog.Builder(itemView.context)
                .setTitle(R.string.remocao_convidado)
                .setMessage(R.string.deseja_remover)
                .setPositiveButton(R.string.remover) { dialog, which ->
                    listener.onDelete(guest.id)
                }
                .setNeutralButton(R.string.cancelar, null)
                .show()

            true
        }
    }
}