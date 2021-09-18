package com.example.springdatajdbcbeyondobvious.bidirectional;

import org.springframework.data.annotation.Id;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

class Minion {
    @Id
    Long id;
    String name;
    AggregateReference<Person, Long> evilMaster;

    Minion(String name, AggregateReference<Person, Long> evilMaster) {
        this.name = name;
        this.evilMaster = evilMaster;
    }
}
