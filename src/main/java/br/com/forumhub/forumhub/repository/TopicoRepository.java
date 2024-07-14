package br.com.forumhub.forumhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.forumhub.forumhub.model.Topic;

public interface TopicoRepository extends JpaRepository<Topic, Long> {
}
