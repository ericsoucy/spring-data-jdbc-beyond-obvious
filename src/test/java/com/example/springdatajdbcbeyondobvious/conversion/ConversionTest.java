package com.example.springdatajdbcbeyondobvious.conversion;

import org.junit.jupiter.api.Test;
import org.springframework.data.jdbc.core.convert.JdbcValue;

class ConversionTest {

    @Test
    void test() {

        Description source = new Description();
        source.personality.put("a", "a-value");
        source.personality.put("b", "b-value");
        source.appearance.put("c", "c-value");
        source.appearance.put("d", "d-value");
        JdbcValue jdbcValue = ConversionApplication.DescriptionToString.INSTANCE.convert(source);

        String jsonString = (String) jdbcValue.getValue();
        System.out.println(jsonString);
        Description target = ConversionApplication.StringToDescription.INSTANCE.convert(jsonString);


    }

}