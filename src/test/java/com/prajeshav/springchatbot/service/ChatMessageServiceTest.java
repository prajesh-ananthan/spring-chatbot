package com.prajeshav.springchatbot.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-dev.properties")
class ChatMessageServiceTest {

    @Autowired
    private ChatMessageService chatMessageService;

    @Test
    void chatShouldReturnNonEmptyResponse() {
        // Given
        var message = "Hello, how are you?";

        // When
        var response = chatMessageService.chat(message);

        // Then
        assertNotNull(response);
        assertFalse(response.isEmpty());
    }
}