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

## Bidirectional Relationship (internal)
- Set the backreference whenever adding an inner entity
- Test [code](./src/test/java/com/example/springdatajdbcbeyondobvious/bidiinternal/BiDiInternalApplicationTests.java)
- Code [code](./src/main/java/com/example/springdatajdbcbeyondobvious/bidiinternal/Toy.java?plain=1#L25)

## Bidirectional Relationship (external)
- use a custom query on the repository
- Test [code](./src/test/java/com/example/springdatajdbcbeyondobvious/bidirectional/BidirectionalApplicationTests.java)
- Code [code](./src/main/java/com/example/springdatajdbcbeyondobvious/bidirectional/MinionRepository.java?plain=1#L10)

## Caching

- Use Spring existing caching abstraction on the repository  
- Test [code](./src/test/java/com/example/springdatajdbcbeyondobvious/caching/CachingApplicationTests.java)
- Code [EnableCaching](./src/main/java/com/example/springdatajdbcbeyondobvious/caching/CachingApplication.java?plain=1#L7 )
- Code [cacheable](./src/main/java/com/example/springdatajdbcbeyondobvious/caching/ColorRepository.java?plain=1#L25)

## Eager Loading References

- Create an entity defining the required combination of aggregates (or their pieces)
- Use a dedicated repository or custom queries
- You may want to persist the query as a database view
- Test [code](./src/test/java/com/example/springdatajdbcbeyondobvious/join/JoinApplicationTests.java)
- Code [custom queries](./src/main/java/com/example/springdatajdbcbeyondobvious/join/MinionRepository.java?plain=1#L25)
- Code [code](./src/main/java/com/example/springdatajdbcbeyondobvious/join/MinionView.java?plain=1#L26)
