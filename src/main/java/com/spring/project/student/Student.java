package com.spring.project.student;

public class Student {
    private int s_RollNo;
    private String s_Name;
    private int Room_no;

    public Student(int s_RollNo, String s_Name, int room_no) {
        this.s_RollNo = s_RollNo;
        this.s_Name = s_Name;
        Room_no = room_no;
    }

    public int getS_RollNo() {
        return s_RollNo;
    }

    public String getS_Name() {
        return s_Name;
    }

    public int getRoom_no() {
        return Room_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_RollNo=" + s_RollNo +
                ", s_Name='" + s_Name + '\'' +
                ", Room_no=" + Room_no +
                '}';
    }
}
