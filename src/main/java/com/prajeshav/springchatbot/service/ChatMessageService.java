package com.prajeshav.springchatbot.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatMessageService {

    private final ChatClient chatClient;

    public ChatMessageService(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }

    public String chat(String message) {
        return chatClient.prompt()
                .user(message)
                .call()
                .content();
    }
}