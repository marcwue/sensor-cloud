package com.myhome.dbservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomMongoRepository extends MongoRepository<Temperature, String> {

    Temperature findBy();
}
