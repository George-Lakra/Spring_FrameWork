package com.spring.project.worker;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WorkerRowMapper implements RowMapper<worker> {
    @Override
    public worker mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new worker(rs.getInt("Eno"),rs.getString("ename"),rs.getString("role"));
    }
}
