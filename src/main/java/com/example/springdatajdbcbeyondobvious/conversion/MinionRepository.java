package com.example.springdatajdbcbeyondobvious.conversion;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


interface MinionRepository extends CrudRepository<Minion, Long> {

}
