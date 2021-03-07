package com.myhome.dbservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.myhome.dbservice.repository")
public class MongoDbConfiguration {

    /*
    @Bean
    public MongoClient mongoClient(){
        ConnectionString connectionString = new ConnectionString("mongodb://mongodb-server:27017");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        return MongoClients.create(mongoClientSettings);
    }

    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(mongoClient(), "sensor-data");
    }
    */

}
