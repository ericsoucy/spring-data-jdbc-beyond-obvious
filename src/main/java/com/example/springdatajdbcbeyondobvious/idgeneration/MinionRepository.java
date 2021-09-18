package com.example.springdatajdbcbeyondobvious.idgeneration;

import org.springframework.data.repository.CrudRepository;



interface MinionRepository extends CrudRepository<Minion, Long> {

}
