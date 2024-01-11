package model;

import java.io.Serializable;
import java.time.LocalDate;



public class Student implements Serializable, Ranking {
    public static final int GOOD_POINT = 7;
    public static final int NORMAL_POINT = 5;
    private String id;
    private String name;
    private String address;
    private LocalDate dateOfBirth;
    private String gender;
    private double point_subject_Math;
    private double point_subject_Physics;
    private double point_subject_Engineering;

    public Student() {
    }

    public Student(String id, String name, String address, LocalDate dateOfBirth, String gender, double point_subject_Math, double point_subject_Physics, double point_subject_Engineering) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.point_subject_Math = point_subject_Math;
        this.point_subject_Physics = point_subject_Physics;
        this.point_subject_Engineering = point_subject_Engineering;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", point_subject_Math=" + point_subject_Math +
                ", point_subject_Physics=" + point_subject_Physics +
                ", point_subject_Engineering=" + point_subject_Engineering +
                '}';
    }
    public double getAvgPoint(){
        return (this.getPoint_subject_Engineering()+this.getPoint_subject_Math()+this.getPoint_subject_Physics())/3;
    }


    @Override
    public String rank() {
        if (this.getAvgPoint() >= GOOD_POINT){
            return "Tot";
        }else if (this.getAvgPoint() >= NORMAL_POINT){
            return "Kha";
        }else {
            return "Kem";
        }
    }
}
