package com.spring.project.issues;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.Scanner;


@Repository
public class IssueRepository {
    private String issue;
    private String issueType;

    Scanner sc = new Scanner(System.in);
    KeyHolder keyHolder = new GeneratedKeyHolder();
    private JdbcTemplate jdbcTemplate;

    public IssueRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    public int addIssue(int sno){
        System.out.println("Enter Issue Details");
        issue=sc.nextLine();
        System.out.println("Enter the Type of Issue");
        issueType=sc.nextLine();
        jdbcTemplate.update(connection->{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO ISSUE (SNO,DETAILS,TYPE) VALUES (?,?,?)", new String[]{"issueid"});
            ps.setInt(1,sno);
            ps.setString(2,issue);
            ps.setString(3,issueType);
            return ps;
        },keyHolder);

        return keyHolder.getKey().intValue();
    }

    /*
    *
    * jdbcTemplate.update(connection -> {
    * ...
    * }, keyHolder);
    * Execute the query, and also store the generated key in this keyHolder.
    *
    * connection -> {
    * ...
    * }
    * JdbcTemplate gives you a database Connection
    *
    * PreparedStatement ps = connection.prepareStatement(
    *   "INSERT INTO ISSUE (SNO,DETAILS,TYPE) VALUES (?,?,?)",
    *       new String[]{"issueid"}
    * );
    *
    * return ps : JdbcTemplate look for a prepare statement
    *
    * keyHolder : a container for generated key
    *
    * keyHolder.getKey() : generate a number as it is in Number we need to convert it into Integer
    * return keyHolder.getKey().intValue(); : .intValue() is used to convert it into.
    *
    * */

    public void issueStatus(int id){
        jdbcTemplate.update("INSERT INTO ISSUESTATUS (ISSUEID) VALUES(?)",id);
    }

    public void deleteIssue(){
        jdbcTemplate.update("DELETE FROM ASSIGNWORK WHERE ISSUEID IN ( SELECT ISSUEID FROM ISSUESTATUS WHERE STATUS ='SOLVED')");
        jdbcTemplate.update("DELETE FROM ISSUE WHERE ISSUEID IN ( SELECT ISSUEID FROM ISSUESTATUS WHERE STATUS='SOLVED' )");
        jdbcTemplate.update("DELETE FROM ISSUESTATUS WHERE STATUS ='SOLVED' ");
        jdbcTemplate.update(
                "DELETE FROM STUDENT " +
                        "WHERE SNO NOT IN (" +
                        "SELECT S.SNO " +
                        "FROM STUDENT AS S " +
                        "INNER JOIN ISSUE AS I ON S.SNO = I.SNO " +
                        "INNER JOIN ISSUESTATUS AS ST ON I.ISSUEID = ST.ISSUEID " +
                        "WHERE ST.STATUS IN ('OPEN','ASSIGN')" +
                        ")"
        );
    }
}
