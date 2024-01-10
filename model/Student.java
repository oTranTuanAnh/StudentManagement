package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person{
    private double point_subject_Math;
    private double point_subject_Physics;
    private double point_subject_Engineering;

    public Student() {
    }

    public Student(double point_subject_Math, double point_subject_Physics, double point_subject_Engineering) {
        this.point_subject_Math = point_subject_Math;
        this.point_subject_Physics = point_subject_Physics;
        this.point_subject_Engineering = point_subject_Engineering;
    }

    public Student(String id, String name, String address, LocalDate dateOfBirth, boolean sexual, double point_subject_Math, double point_subject_Physics, double point_subject_Engineering) {
        super(id, name, address, dateOfBirth, sexual);
        this.point_subject_Math = point_subject_Math;
        this.point_subject_Physics = point_subject_Physics;
        this.point_subject_Engineering = point_subject_Engineering;
    }

    public double getPoint_subject_Math() {
        return point_subject_Math;
    }

    public void setPoint_subject_Math(double point_subject_Math) {
        this.point_subject_Math = point_subject_Math;
    }

    public double getPoint_subject_Physics() {
        return point_subject_Physics;
    }

    public void setPoint_subject_Physics(double point_subject_Physics) {
        this.point_subject_Physics = point_subject_Physics;
    }

    public double getPoint_subject_Engineering() {
        return point_subject_Engineering;
    }

    public void setPoint_subject_Engineering(double point_subject_Engineering) {
        this.point_subject_Engineering = point_subject_Engineering;
    }

    @Override
    public String showInfor() {
        return "Student{" +
                super.toString()+
                "point_subject_Math=" + point_subject_Math +
                ", point_subject_Physics=" + point_subject_Physics +
                ", point_subject_Engineering=" + point_subject_Engineering+
                '}';
    }
}
