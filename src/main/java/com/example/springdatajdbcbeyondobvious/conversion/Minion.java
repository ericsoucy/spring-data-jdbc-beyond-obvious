package com.example.springdatajdbcbeyondobvious.conversion;

import org.springframework.data.annotation.Id;

class Minion {
    @Id
    Long id;
    String name;
    Description description = new Description();

    Minion(String name) {
        this.name = name;
    }
}
