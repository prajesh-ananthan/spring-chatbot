package com.prajeshav.springchatbot;

import org.springframework.boot.SpringApplication;

public class TestSpringChatbotApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringChatbotApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
