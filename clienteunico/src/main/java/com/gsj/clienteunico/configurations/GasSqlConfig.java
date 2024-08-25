package com.gsj.clienteunico.configurations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
public class GasSqlConfig {

    @Bean(name = "gasSqlServerDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.gas")
    public DataSource gasSqlServerDataSource() {
        return new DriverManagerDataSource();
    }

    @Bean(name = "gasJdbcTemplate")
    public JdbcTemplate gasJdbcTemplate(@Qualifier("gasSqlServerDataSource") DataSource gasDataSource) {
        return new JdbcTemplate(gasDataSource);
    }
}
