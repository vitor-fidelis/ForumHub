package br.com.forumhub.forumhub.model.dto;

import jakarta.validation.constraints.NotNull;

public record AtualizacaoTopicoDTO(
        @NotNull
        Long id,

        String titulo,

        String mensagem,

        String estado,

        String autor,

        String curso
) {
}
