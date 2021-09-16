package com.example.springdatajdbcbeyondobvious.idgeneration;

import org.springframework.data.annotation.Id;

class StringIdMinion {
    @Id
    String id;
    String name;

    StringIdMinion(String name) {
        this.name = name;
    }
}
