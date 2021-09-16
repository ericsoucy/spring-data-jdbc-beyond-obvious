package com.example.springdatajdbcbeyondobvious.idgeneration;

import org.springframework.data.annotation.Id;

class Minion {
    @Id
    Long id;
    String name;

    Minion(String name) {
        this.name = name;
    }
}
