package com.spring.project.admin;

import com.spring.project.issues.IssueRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AssignRepository {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public AssignRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void assignIssue(int issueID, int ENO){
        jdbcTemplate.update("INSERT INTO ASSIGNWORK (ISSUEID,ENO) VALUES(?,?)",issueID,ENO);
        jdbcTemplate.update("UPDATE ISSUESTATUS SET STATUS='ASSIGN' WHERE ISSUEID=?",issueID);
    }

    public List unsignedTask(){
        return jdbcTemplate.query(" SELECT I.* FROM ISSUE AS I INNER JOIN ISSUESTATUS AS ST ON I.ISSUEID = ST.ISSUEID WHERE ST.STATUS='OPEN' ",new IssueRowMapper());
    }
}
