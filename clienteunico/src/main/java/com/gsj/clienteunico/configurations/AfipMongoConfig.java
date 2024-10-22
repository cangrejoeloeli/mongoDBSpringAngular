package com.gsj.clienteunico.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(basePackages = "com.gsj.clienteunico.repositories.mongoAfip", mongoTemplateRef = "AfipMongoTemplate")
public class AfipMongoConfig {

    @Bean(name = "AfipMongoTemplate")
    public MongoTemplate afipMongoTemplate() {
        return new MongoTemplate(afipMongoClient(), afipDatabase());
    }

    @Bean
    public MongoClient afipMongoClient() {
        return MongoClients.create("mongodb://localhost:27017");
    }

    @Bean
    public String afipDatabase() {
        return "afip";
    }

}
