package com.gsj.clienteunico.configurations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class AcercaSqlConfig {

    @Bean(name = "acercaSqlServerDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.acerca")
    public DataSource acercaSqlServerDataSource() {
        return new DriverManagerDataSource();
    }

    @Bean(name = "acercaJdbcTemplate")
    public JdbcTemplate acercaJdbcTemplate(@Qualifier("acercaSqlServerDataSource") DataSource acercaDataSource) {
        return new JdbcTemplate(acercaDataSource);
    }

}
