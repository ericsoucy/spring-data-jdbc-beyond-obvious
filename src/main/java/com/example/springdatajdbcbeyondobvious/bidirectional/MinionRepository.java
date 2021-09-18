package com.example.springdatajdbcbeyondobvious.bidirectional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

interface MinionRepository extends CrudRepository<Minion, Long> {

    @Query("select * from Minion where evil_master = :id")
    Collection<Minion> findByEvilMaster(Long id);
}
