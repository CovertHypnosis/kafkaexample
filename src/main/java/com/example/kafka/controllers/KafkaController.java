package com.example.kafka.controllers;

import com.example.kafka.services.Producer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private final Producer producer;

    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping("/")
    public ResponseEntity sendKafkaMessage(@RequestParam("message") String message) {
        this.producer.sendMessage("boot", message);
        return new ResponseEntity(HttpStatus.OK);
    }
}
