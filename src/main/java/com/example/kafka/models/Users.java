package com.example.kafka.models;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "users", type = "users", shards = 1)
public class Users {
    private Long id;
    private String name;
    private String surname;

    public Users() {
    }

    public Users(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
