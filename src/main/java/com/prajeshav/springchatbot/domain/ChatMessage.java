package com.prajeshav.springchatbot.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

/**
 * Created by Prajesh AV
 * Date: 1/6/2025
 */

@Entity
@Table(name = "chat_message")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMessage extends BaseDomain {

    @Column(nullable = false)
    private String sessionId;

    @Column(nullable = false, length = 1000)
    private String userMessage;

    @Column(length = 1000)
    private String botResponse;

    @Column(length = 4, columnDefinition = "default 'chat'")
    private String messageType;

    @Column(length = 500)
    private String metadata;
}