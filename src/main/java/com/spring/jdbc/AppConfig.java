package com.spring.jdbc;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class AppConfig {
    Dotenv dotenv= Dotenv.load();
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(dotenv.get("DRIVER"));
        ds.setUrl(dotenv.get("URL"));
        ds.setUsername(dotenv.get("USER_NAME"));
        ds.setPassword(dotenv.get("USER_PASSWORD"));
        return ds;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public StudentRepository studentRepository(){
        return new StudentRepository(jdbcTemplate());
    }
}
