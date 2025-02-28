package com.example.chatbot_mobile.bin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chatbot_mobile.R
import com.example.chatbot_mobile.bin.data.chat

class history_chat_adapter (
    var listChat: MutableList<chat>
) : RecyclerView.Adapter<history_chat_adapter.historyChatViewholder>() {

    inner class historyChatViewholder (itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): historyChatViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_history, parent, false)
        return historyChatViewholder(view)
    }

    override fun onBindViewHolder(holder: historyChatViewholder, position: Int) {
        holder.itemView.apply {
            val tvItemChatHistory = findViewById<TextView>(R.id.tvItemChatHistory)
            tvItemChatHistory.text = listChat[position].chatValue
        }
    }

    override fun getItemCount(): Int {
        return listChat.size
    }

}