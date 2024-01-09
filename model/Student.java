package model;

import java.time.LocalDate;

public class Student {
    private String studentID;
    private String studentName;
    private String address;
    private LocalDate dateOfBirth;
    private boolean sexual;
    private double subjectPoint1;
    private double subjectPoint2;
    private double subjectPoint3;

    public Student() {
    }

    public Student(String studentID, String studentName, String address, LocalDate dateOfBirth, boolean sexual, double subjectPoint1, double subjectPoint2, double subjectPoint3) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.sexual = sexual;
        this.subjectPoint1 = subjectPoint1;
        this.subjectPoint2 = subjectPoint2;
        this.subjectPoint3 = subjectPoint3;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isSexual() {
        return sexual;
    }

    public void setSexual(boolean sexual) {
        this.sexual = sexual;
    }

    public double getSubjectPoint1() {
        return subjectPoint1;
    }

    public void setSubjectPoint1(double subjectPoint1) {
        this.subjectPoint1 = subjectPoint1;
    }

    public double getSubjectPoint2() {
        return subjectPoint2;
    }

    public void setSubjectPoint2(double subjectPoint2) {
        this.subjectPoint2 = subjectPoint2;
    }

    public double getSubjectPoint3() {
        return subjectPoint3;
    }

    public void setSubjectPoint3(double subjectPoint3) {
        this.subjectPoint3 = subjectPoint3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", sexual=" + sexual +
                ", subjectPoint1=" + subjectPoint1 +
                ", subjectPoint2=" + subjectPoint2 +
                ", subjectPoint3=" + subjectPoint3 +
                '}';
    }
}
