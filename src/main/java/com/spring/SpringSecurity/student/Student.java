package com.spring.SpringSecurity.student;

public class Student
{
    private final Integer studentId;
    private final String studentName;

    public Student(int studentId, String studentName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public String getStudentName()
    {
        return studentName;
    }
}
