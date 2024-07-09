package br.com.forumhub.forumhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.forumhub.forumhub.model.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
