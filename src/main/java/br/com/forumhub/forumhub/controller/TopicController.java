package br.com.forumhub.forumhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.transaction.annotation.Transactional;

import br.com.forumhub.forumhub.model.Topic;
import br.com.forumhub.forumhub.repository.TopicRepository;

@RestController
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicRepository topicRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<Topic> createTopic(@RequestBody Topic topic) {
        Topic savedTopic = topicRepository.save(topic);
        return ResponseEntity.ok(savedTopic);
    }
}
