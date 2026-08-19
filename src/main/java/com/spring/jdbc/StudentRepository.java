package com.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

@Repository
public class StudentRepository {
    Scanner sc = new Scanner(System.in);
    private JdbcTemplate jdbcTemplate;
    StudentRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    public void addStudent(){
        System.out.println("Enter the Student's Roll NO : ");
        int roll= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Student's name : ");
        String name = sc.nextLine();
        System.out.println("Enter the Student's Class : ");
        int Class= sc.nextInt();
        int row = jdbcTemplate.update(
                "INSERT INTO student(roll_no,name,class) VALUES(?,?,?)",
                roll,name,Class);
    }
    public void updateStudentName(){
        System.out.println("Enter the Student Roll NO to update name : ");
        int roll= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Student name : ");
        String name = sc.nextLine();
        int row = jdbcTemplate.update(
                "UPDATE student set name = ? where roll_no=?",
                name,roll
        );
    }
    public List getStudent(){
        List<Student> student = jdbcTemplate.query("SELECT * FROM student",new StudentRowMapper());
        return student;
    }

    public Student getStudentByID(){
        System.out.println("Enter Student' Roll No to retrieve details");
        int roll = sc.nextInt();
        return jdbcTemplate.queryForObject(
                "SELECT * FROM student WHERE roll_no = ?",
                    new StudentRowMapper(),roll
                );
    }
}
