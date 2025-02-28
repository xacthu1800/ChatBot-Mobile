package com.example.chatbot_mobile.bin.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chatbot_mobile.R
import com.example.chatbot_mobile.bin.adapters.history_chat_adapter
import com.example.chatbot_mobile.bin.data.chat
import com.example.chatbot_mobile.bin.data.listChat
import com.example.chatbot_mobile.ui.theme.ChatBotMobileTheme

class chatHistory_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        supportActionBar?.hide()
        setContentView(R.layout.history_chat)

        val rvHistoryChat = findViewById<RecyclerView>(R.id.rvHistoryChat)
        val chatList = listChat(mutableListOf())

        chatList.listChat.add(chat("What is your name?"))
        chatList.listChat.add(chat("How old are you?"))
        chatList.listChat.add(chat("Where are you from?"))
        chatList.listChat.add(chat("Do you like coffee?"))
        chatList.listChat.add(chat("What is your favorite color?"))
        chatList.listChat.add(chat("Nguyễn Văn Bin có bằng TOEIC 765/990 điểm"))
        chatList.listChat.add(chat("What's your favorite movie?"))
        chatList.listChat.add(chat("Do you like traveling?"))
        chatList.listChat.add(chat("What is your hobby?"))
        chatList.listChat.add(chat("What's the weather like?"))
        chatList.listChat.add(chat("What music do you like?"))
        chatList.listChat.add(chat("Do you speak any languages?"))
        chatList.listChat.add(chat("What's your favorite sport?"))
        chatList.listChat.add(chat("Do you play video games?"))
        chatList.listChat.add(chat("Have you ever been abroad?"))
        chatList.listChat.add(chat("Do you like reading books?"))
        chatList.listChat.add(chat("What's your dream job?"))
        chatList.listChat.add(chat("Do you like cooking?"))
        chatList.listChat.add(chat("What's your favorite season?"))
        chatList.listChat.add(chat("Are you a morning person?"))

        val historyChatAdapter = history_chat_adapter(chatList.listChat)
        rvHistoryChat.adapter = historyChatAdapter
        rvHistoryChat.layoutManager = LinearLayoutManager(this)


    }
}