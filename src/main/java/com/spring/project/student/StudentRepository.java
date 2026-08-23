package com.spring.project.student;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class StudentRepository {
    Scanner sc = new Scanner(System.in);
    JdbcTemplate jdbcTemplate ;

    public StudentRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    public int addStudent(){
        System.out.println("Enter the Student Roll No");
        int sno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Student name");
        String sname = sc.nextLine();
        System.out.println("Enter the room number");
        int room=sc.nextInt();
        jdbcTemplate.update("INSERT INTO student (SNO,SNAME,ROOM) VALUES(?,?,?)",sno,sname,room);
        return sno;
    }
    public List<StudentIssue> showIssue(int sno){
        return jdbcTemplate.query("SELECT * FROM STUDENT as S INNER JOIN ISSUE AS I ON S.SNO=I.SNO WHERE S.SNO=?"
                ,new StudentIssueRowMapper(),sno);
    }

}
