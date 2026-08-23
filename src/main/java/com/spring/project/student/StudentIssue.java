package com.spring.project.student;
import com.spring.project.issues.Issue;

public class StudentIssue {
    private Student student;
    private Issue issue;

    public StudentIssue(Student student, Issue issue) {
        this.student = student;
        this.issue = issue;
    }

    public Student getStudent() {
        return student;
    }

    public Issue getIssue() {
        return issue;
    }

    @Override
    public String toString() {
        return "StudentIssue{" +
                "student=" + student +
                ", issue=" + issue +
                '}';
    }
}
