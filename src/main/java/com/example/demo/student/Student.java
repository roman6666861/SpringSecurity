package com.example.demo.student;

public class Student {
    private final Integer studentid;
    private final String studentName;

    public Integer getStudentid() {
        return studentid;
    }

    public String getStudentName() {
        return studentName;
    }

    public Student(Integer studentid, String studentName) {
        this.studentid = studentid;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
