package br.com.forumhub.forumhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.transaction.annotation.Transactional;

import br.com.forumhub.forumhub.model.Topic;
import br.com.forumhub.forumhub.repository.TopicRepository;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/topics")
public class TopicController {

    private static final Logger logger = LoggerFactory.getLogger(TopicController.class);

    @Autowired
    private TopicRepository topicRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<Topic> createTopic(@RequestBody Topic topic) {
        logger.debug("Recebida requisição POST para criar um tópico: {}", topic);
        Topic savedTopic = topicRepository.save(topic);
        logger.debug("Tópico salvo com sucesso: {}", savedTopic);
        return ResponseEntity.ok(savedTopic);
    }

    @GetMapping
    public ResponseEntity<List<Topic>> getAllTopics() {
        logger.debug("Recebida requisição GET para listar todos os tópicos");
        List<Topic> topics = topicRepository.findAll();
        logger.debug("Tópicos encontrados: {}", topics);
        return ResponseEntity.ok(topics);
    }
}

