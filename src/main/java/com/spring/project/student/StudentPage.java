package com.spring.project.student;
import com.spring.project.issues.IssueRepository;

import java.util.List;
import java.util.Scanner;



public class StudentPage {
    Scanner sc = new Scanner(System.in);
    private StudentRepository studentRepository;
    private Student student;
    private int sno;
    private int issueid;
    private IssueRepository issue;
    public StudentPage(StudentRepository studentRepository, IssueRepository issue){
        this.studentRepository=studentRepository;
        this.issue=issue;
    }

    public void complainIssue(){
        sno=studentRepository.addStudent();
        issueid = issue.addIssue(sno);
        issue.issueStatus(issueid);
    }

    public void showComplain(){
        System.out.println("Enter Your Roll Number");
        int roll=sc.nextInt();
        List<StudentIssue> students = studentRepository.showIssue(roll);
        if(!students.isEmpty()) {
            for (StudentIssue s : students) {
                System.out.println(s);
            }
        }else{
            System.out.println("No Issue !");
        }
    }
}
