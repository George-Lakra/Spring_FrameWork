package com.spring.project.worker;

import com.spring.project.student.StudentIssue;
import com.spring.project.student.StudentIssueRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class WorkerRepository {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    Scanner sc = new Scanner(System.in);

    public WorkerRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void updateStatus(){
        System.out.println("Enter the Assigned Issue ID");
        int issuID=sc.nextInt();
        jdbcTemplate.update("UPDATE ISSUESTATUS SET STATUS ='SOLVED' where ISSUEID=?",issuID);
    }

    public List<StudentIssue> showIssue(int Eno){
        return jdbcTemplate.query("SELECT * FROM STUDENT as S INNER JOIN ISSUE AS I ON S.SNO=I.SNO INNER JOIN ASSIGNWORK AS A ON I.ISSUEID=A.ISSUEID INNER JOIN WORKER AS W ON A.ENO=W.ENO WHERE W.ENO=? "
                ,new StudentIssueRowMapper(),Eno);
    }

    public void addworker(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Number");
        int eno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name");
        String name= sc.nextLine();
        System.out.println("Enter Employee Role");
        String role = sc.nextLine();
        jdbcTemplate.update("INSERT INTO WORKER(ENO,ENAME,ROLE) VALUES(?,?,?)",eno,name,role);
    }
}
