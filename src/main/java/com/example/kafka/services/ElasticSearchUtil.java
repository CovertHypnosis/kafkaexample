package com.example.kafka.services;

import com.example.kafka.models.Users;
import com.example.kafka.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElasticSearchUtil {
    @Autowired
    MessageRepository messageRepository;

    public void saveString(String message) {
        Users users = new Users();
        users.setName("john");
        users.setSurname(message);
        messageRepository.save(users);
    }
}
