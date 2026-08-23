package com.spring.project.issues;

public class Issue {
    private int sno;
    private int issueid;
    private String issue;
    private String issueType;

    public Issue(int sno,int issueid, String issue, String issueType) {
        this.sno=sno;
        this.issueid = issueid;
        this.issue = issue;
        this.issueType = issueType;
    }

    public int getIssueid() {
        return issueid;
    }

    public String getIssue() {
        return issue;
    }

    public String getIssueType() {
        return issueType;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "sno=" + sno +
                ", issueid=" + issueid +
                ", issue='" + issue + '\'' +
                ", issueType='" + issueType + '\'' +
                '}';
    }
}
