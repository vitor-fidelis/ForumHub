package br.com.forumhub.forumhub.model;
import br.com.forumhub.forumhub.model.dto.AtualizacaoTopicoDTO;
import br.com.forumhub.forumhub.model.dto.TopicDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "topics")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O título não pode estar em branco")
    @Column(nullable = false)
    private String titulo;

    @NotBlank(message = "A mensagem não pode estar em branco")
    @Column(nullable = false)
    private String mensagem;

    @Column(name = "data_criacao", nullable = false)
    private LocalDateTime dataCriacao;

    @NotBlank(message = "O estado não pode estar em branco")
    @Column(nullable = false)
    private String estado;

    @NotBlank(message = "O autor não pode estar em branco")
    @Column(nullable = false)
    private String autor;

    private String curso;

    // Construtores, getters e setters

    public Topic() {
        // Construtor padrão vazio necessário para JPA
    }

    public Topic(String titulo, String mensagem, String estado, String autor, String curso) {
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.estado = estado;
        this.autor = autor;
        this.curso = curso;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Método que será chamado antes de persistir a entidade
    @PrePersist
    protected void onCreate() {
        dataCriacao = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", mensagem='" + mensagem + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", estado='" + estado + '\'' +
                ", autor='" + autor + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }

    public void atualizarTopico(AtualizacaoTopicoDTO dto) throws Exception {
        if(dto.titulo() != null ){
            this.titulo = dto.titulo();
        }

        if(dto.mensagem() != null ){
            this.mensagem = dto.mensagem();
        }

        if(dto.estado() != null ){
            this.estado = dto.estado();
        }

        if(dto.autor() != null ){
            this.autor = dto.autor();
        }

        if(dto.curso() != null ){
            this.curso = dto.curso();
        }

    }
}



