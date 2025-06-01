# Spring AI Customer Service Chatbot

This project is a comprehensive AI-powered customer service chatbot built with Spring Boot. It integrates with a local database for message persistence and utilizes advanced AI models to provide intelligent and responsive conversations.

## Features

*   **AI-Powered Conversations**: Leverages the Ollama framework with the Gemma 2 12B Instruct QAT model for natural language understanding and generation, enabling the chatbot to engage in intelligent customer service interactions.
*   **Local Database Integration**: Stores conversation history and other relevant data using a local database (H2 by default, configurable for others).
*   **Spring Boot**: Built on the Spring Boot framework for rapid application development, ease of configuration, and a robust, production-ready environment.
*   **Customer Service Focused**: Designed specifically to handle customer inquiries, provide support, and offer assistance.

## Technologies Used

*   **Java 21**: The primary programming language.
*   **Spring Boot 3.5.0**: Framework for building the application.
*   **Spring AI**: Facilitates integration with AI models like Ollama.
*   **Ollama**: Open-source framework for running large language models locally.
*   **Gemma 2 12B Instruct QAT**: The specific AI model used for generating responses.
*   **Spring Data JPA**: For database interaction and object-relational mapping.
*   **Lombok**: Reduces boilerplate code (e.g., getters, setters, constructors).
*   **H2 Database**: An in-memory relational database used for development and testing.

## Getting Started

### Prerequisites

*   Java Development Kit (JDK) 21 or newer
*   Maven 3.6.0 or newer
*   [Ollama](https://ollama.ai/download) installed and running locally
*   The `gemma2:27b-instruct-q4_K_M` model downloaded in Ollama. You can download it using the command: `ollama pull gemma2:27b-instruct-q4_K_M`

### Installation

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/prajesh-ananthan/spring-chatbot.git
    cd spring-chatbot
    ```
2.  **Configure Ollama:**
    Ensure Ollama is running and you have downloaded the `gemma2:27b-instruct-q4_K_M` model. The `application.properties` file is configured to use this model by default.

3.  **Build the project:**
    ```bash
    mvn clean install -DskipTests
    ```

4.  **Run the application:**
    ```bash
    mvn spring-boot:run
    ```
    The application will start on the default Spring Boot port (8080) unless configured otherwise.

### Configuration

The main configuration for the chatbot, including Ollama settings and database properties, can be found in `src/main/resources/application.properties` and `src/main/resources/application-dev.properties`.

**Key AI Configuration (application.properties):**

```properties
spring.ai.ollama.base-url=http://localhost:11434
spring.ai.ollama.chat.model=gemma2:27b-instruct-q4_K_M
# ... other Ollama chat options