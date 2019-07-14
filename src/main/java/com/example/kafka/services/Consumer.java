package com.example.kafka.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
    @Autowired
    ElasticSearchUtil elasticSearchUtil;

    @KafkaListener(topics = "boot", groupId = "group_id")
    public void consume(String message) {
        elasticSearchUtil.saveString(message);
        logger.info(String.format("Received message => %s", message));
    }
}
