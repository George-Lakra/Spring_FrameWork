package com.spring.project.issues;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IssueRowMapper implements RowMapper {
    @Override
    public Issue mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Issue(rs.getInt("sno"),rs.getInt("ISSUEID"),rs.getString("DETAILS"),rs.getString("TYPE"));
    }
}
