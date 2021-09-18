package com.example.springdatajdbcbeyondobvious.bidirectional;

import org.springframework.data.annotation.Id;

class Person {
    @Id
    Long id;
    String name;

    Person(String name) {
        this.name = name;
    }
}
