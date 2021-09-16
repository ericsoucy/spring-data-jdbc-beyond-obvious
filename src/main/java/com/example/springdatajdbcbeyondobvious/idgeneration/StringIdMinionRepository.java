package com.example.springdatajdbcbeyondobvious.idgeneration;

import org.springframework.data.repository.CrudRepository;

interface StringIdMinionRepository extends CrudRepository<StringIdMinion, String> {

}
