
-- Flyway migration script for chat_message table creation
-- File: V2__Create_chat_message_table.sql

CREATE TABLE chat_message (
                              id BIGINT PRIMARY KEY AUTO_INCREMENT,
                              session_id VARCHAR(255) NOT NULL,
                              user_message VARCHAR(1000) NOT NULL,
                              bot_response VARCHAR(1000),
                              message_type VARCHAR(4) DEFAULT 'chat',
                              metadata VARCHAR(500),
                              created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                              updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Add indexes for common query patterns
CREATE INDEX idx_chat_message_session_id ON chat_message(session_id);
CREATE INDEX idx_chat_message_created_at ON chat_message(created_at);
CREATE INDEX idx_chat_message_type ON chat_message(message_type);