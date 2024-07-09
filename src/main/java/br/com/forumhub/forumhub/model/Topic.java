package br.com.forumhub.forumhub.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "topics")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Lob
    @Column(nullable = false)
    private String mensagem;

    @Column(name = "data_criacao", nullable = false)
    private LocalDateTime dataCriacao;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private String autor;

    @Column(nullable = false)
    private String curso;

    // Getters e Setters
}


