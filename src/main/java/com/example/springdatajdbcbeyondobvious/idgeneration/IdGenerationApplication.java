package com.example.springdatajdbcbeyondobvious.idgeneration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.relational.core.mapping.event.BeforeSaveCallback;

import java.util.UUID;

@SpringBootApplication
class IdGenerationApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdGenerationApplication.class, args);
    }

    @Bean
    BeforeSaveCallback<StringIdMinion> beforeSaveCallback() {

        return (minion, mutableAggregateChange) -> {
            if (minion.id == null) {
                minion.id = UUID.randomUUID().toString();
            }
            return minion;
        };
    }

}