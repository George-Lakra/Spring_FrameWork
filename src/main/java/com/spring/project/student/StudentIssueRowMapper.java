package com.spring.project.student;

import com.spring.project.issues.Issue;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentIssueRowMapper implements RowMapper<StudentIssue> {
    @Override
    public StudentIssue mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student(rs.getInt("sno"),rs.getString("sname"),rs.getInt("room"));
        Issue issue = new Issue(rs.getInt("sno"),rs.getInt("issueid"),rs.getString("details"),rs.getString("type"));
        return  new StudentIssue(student,issue);
    }
}
