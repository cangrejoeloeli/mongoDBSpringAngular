package com.gsj.clienteunico.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(basePackages = "com.gsj.clienteunico.repositories.mongoGsj", mongoTemplateRef = "GsjMongoTemplate")
public class GsjMongoConfig {

    @Bean(name = "GsjMongoTemplate")
    public MongoTemplate GsjMongoTemplate() {
        return new MongoTemplate(GsjMongoClient(), GsjDatabase());
    }

    @Bean
    public MongoClient GsjMongoClient() {
        return MongoClients.create("mongodb://localhost:27017");
    }

    @Bean
    public String GsjDatabase() {
        return "gsj";
    }
}