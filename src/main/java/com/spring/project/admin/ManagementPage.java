package com.spring.project.admin;

import com.spring.project.issues.Issue;
import com.spring.project.issues.IssueRepository;
import com.spring.project.worker.WorkerPage;
import com.spring.project.worker.WorkerRepository;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class ManagementPage {
    private AssignRepository assign;
    private WorkerRepository worker;
    private IssueRepository issueRe;
    public ManagementPage(AssignRepository assign, WorkerRepository worker, IssueRepository issueRe){
        this.assign=assign;
        this.worker=worker;
        this.issueRe=issueRe;
    }
    public void assignWork(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Issue ID");
        int issueid=sc.nextInt();
        System.out.println("Enter the Employee ID");
        int eno=sc.nextInt();
        assign.assignIssue(issueid,eno);
    }
    public void unAssignedIssue(){
        List<Issue> list = assign.unsignedTask();
        if(! list.isEmpty()) {
            for (Issue i : list) {
                System.out.println(i);
            }
        }else{
            System.out.println("No Issue has been Raised");
        }
    }
    public void addWorker(){
        worker.addworker();
    }
    public void terminateIssue(){
        issueRe.deleteIssue();
    }
}
