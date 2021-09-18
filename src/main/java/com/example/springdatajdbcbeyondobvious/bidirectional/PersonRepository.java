package com.example.springdatajdbcbeyondobvious.bidirectional;

import org.springframework.data.repository.CrudRepository;

interface PersonRepository extends CrudRepository<Person, Long> {

}
