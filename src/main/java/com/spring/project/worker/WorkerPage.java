package com.spring.project.worker;

import com.spring.project.student.StudentIssue;
import com.spring.project.student.StudentIssueRowMapper;
import com.spring.project.student.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class WorkerPage {
    private int eno;
    Scanner sc = new Scanner(System.in);
    WorkerRepository workerRepository;

    public WorkerPage(WorkerRepository workerRepository) {
        this.workerRepository= workerRepository;
    }

    public void solvedStatus(){
        workerRepository.updateStatus();
    }
    public void seeAssignedTask(){
        System.out.println("Enter Your Employee ID");
        eno=sc.nextInt();
        List<StudentIssue> list = workerRepository.showIssue(eno);
        if(!list.isEmpty()) {
            for (StudentIssue s : list) {
                System.out.println(s);
            }
        }else{
            System.out.println("NO Task has been assigned.");
        }
    }
}
