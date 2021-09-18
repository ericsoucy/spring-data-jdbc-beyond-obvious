# Spring Data JDBC: Beyond the Obvious

Based on <https://www.youtube.com/watch?v=SJlKBkZ2yAU&t=969s>

## User Defined Ids
- jdbcAggregateTemplate.insert [code](./src/test/java/com/example/springdatajdbcbeyondobvious/idgeneration/IdGenerationApplicationTests.java?plain=1#L22)
- BeforeSaveCallback [code](./src/main/java/com/example/springdatajdbcbeyondobvious/idgeneration/IdGenerationApplication.java?plain=1#L18)

## JSON / Custom Conversions
- Use a custom type  [code](./src/main/java/com/example/springdatajdbcbeyondobvious/conversion/Description.java) 
- Register custom converters [code](./src/main/java/com/example/springdatajdbcbeyondobvious/conversion/ConversionApplication.java?plain=1#L34)
- don't forget `@ReadingConvert / @WritingConverter` [code](./src/main/java/com/example/springdatajdbcbeyondobvious/conversion/ConversionApplication.java?plain=1#L38)

- Test [code](./src/test/java/com/example/springdatajdbcbeyondobvious/conversion/ConversionApplicationTests.java)
- Code [code](./src/main/java/com/example/springdatajdbcbeyondobvious/conversion/ConversionApplication.java)