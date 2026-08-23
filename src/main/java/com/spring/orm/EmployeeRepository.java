package com.spring.orm;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeRepository {
    private JdbcTemplate jdbcTemplate;

    public EmployeeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
