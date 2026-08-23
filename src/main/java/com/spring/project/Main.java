package com.spring.project;

import com.spring.project.admin.ManagementPage;
import com.spring.project.student.StudentPage;
import com.spring.project.worker.WorkerPage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ISSUE MANAGEMENT SYSTEM =====");
        System.out.println("1. Student");
        System.out.println("2. Manager");
        System.out.println("3. Worker");
        System.out.print("Select user: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                StudentPage studentPage =
                        context.getBean(StudentPage.class);

                System.out.println("\n===== STUDENT =====");
                System.out.println("1. Raise Issue");
                System.out.println("2. View My Issues");
                System.out.print("Select operation: ");

                int studentChoice = sc.nextInt();

                switch (studentChoice) {
                    case 1:
                        studentPage.complainIssue();
                        break;

                    case 2:
                        studentPage.showComplain();
                        break;

                    default:
                        System.out.println("Invalid student option.");
                }
                break;


            case 2:
                ManagementPage managerPage =
                        context.getBean(ManagementPage.class);

                System.out.println("\n===== MANAGER =====");
                System.out.println("1. View Unassigned Issues");
                System.out.println("2. Assign Issue");
                System.out.println("3. Delete Solved Issues");
                System.out.println("4. Add Employee");
                System.out.print("Select operation: ");

                int managerChoice = sc.nextInt();

                switch (managerChoice) {

                    case 1:
                        managerPage.unAssignedIssue();
                        break;

                    case 2:
                        managerPage.assignWork();
                        break;

                    case 3:
                        managerPage.terminateIssue();
                        break;
                    case 4:
                        managerPage.addWorker();
                        break ;
                    default:
                        System.out.println("Invalid manager option.");
                }
                break;


            case 3:
                WorkerPage workerPage =
                        context.getBean(WorkerPage.class);

                System.out.println("\n===== WORKER =====");
                System.out.println("1. View Assigned Tasks");
                System.out.println("2. Solve Issue");
                System.out.print("Select operation: ");

                int workerChoice = sc.nextInt();

                switch (workerChoice) {

                    case 1:
                        workerPage.seeAssignedTask();
                        break;

                    case 2:
                        workerPage.solvedStatus();
                        break;

                    default:
                        System.out.println("Invalid worker option.");
                }
                break;


            default:
                System.out.println("Invalid user choice.");
        }

        sc.close();
    }
}