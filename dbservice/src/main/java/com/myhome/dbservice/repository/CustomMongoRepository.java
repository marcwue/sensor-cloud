package com.myhome.dbservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface CustomMongoRepository extends MongoRepository<Temperature, String> {

    List<Temperature> findByDateBetween(Date startDate, Date endDate);
}
