package com.gsj.clienteunico.configurations;

import org.glassfish.jaxb.core.annotation.OverrideAnnotationOf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.mapping.context.MappingContext;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.IndexOperations;
import org.springframework.data.mongodb.core.index.IndexResolver;
import org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexResolver;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoPersistentEntity;
import org.springframework.data.mongodb.core.mapping.MongoPersistentProperty;
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

    @EventListener(ContextRefreshedEvent.class)
    public void initIndicesAfterStartup() {
        MongoTemplate mongoTemplate = GsjMongoTemplate();

        MappingContext<? extends MongoPersistentEntity<?>, MongoPersistentProperty> mappingContext = mongoTemplate
                .getConverter().getMappingContext();
        IndexResolver resolver = new MongoPersistentEntityIndexResolver(mappingContext);
        // consider only entities that are annotated with @Document
        mappingContext.getPersistentEntities()
                .stream()
                .filter(it -> it.isAnnotationPresent(Document.class))
                .forEach(it -> {

                    IndexOperations indexOps = mongoTemplate.indexOps(it.getType());
                    resolver.resolveIndexFor(it.getType()).forEach(indexOps::ensureIndex);
                });
    }

}