-- V1__Create_topics_table.sql
CREATE TABLE topics (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    mensagem TEXT NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    estado VARCHAR(50) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    curso VARCHAR(255) NOT NULL
);
