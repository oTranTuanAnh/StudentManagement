package model;

import storage.ReadWriteFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager{
    private Student student;
    public static final String DATA_FILE = "data.txt";
    private static final ReadWriteFile instanceReadWrite = ReadWriteFile.getInstance();
    public ArrayList<Student> studentArrayList;

    public StudentManager() {
        this.studentArrayList = (ArrayList<Student>) instanceReadWrite.readData(DATA_FILE);
    }


    public StudentManager(Student student) {
        this.student = student;
    }

    public int intInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public double doubleInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    public String stringInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public void editStudentName(Student student, String name){
        student.setName(name);
    }
    public void editStudentAddress(Student student, String address){
        student.setAddress(address);
    }
    public void editStudentDateOfBirth(Student student, LocalDate date){
        student.setDateOfBirth(date);
    }
    public void editStudentGender(Student student, String gender){
        student.setGender(gender);
    }
    public void editStudentPoint_Math(Student student, double point){
        student.setPoint_subject_Math(point);
    }
    public void editStudentPoint_Physic(Student student, double point){
        student.setPoint_subject_Physics(point);
    }
    public void editStudentPoint_Engineer(Student student, double point){
        student.setPoint_subject_Engineering(point);
    }

    public void addStudent(Student student){
        this.studentArrayList.add(student);
    }
    public void removeStudent(Student student){
        this.studentArrayList.remove(student);
    }
    public void writeStudent(){
        instanceReadWrite.writeData(DATA_FILE,this.studentArrayList);
    }

    public String getStudentInfor(Student student){
        return String.format("%-12s%-30s%-20s%-25s%-17s%-20s%-20s%-20s","MSSV: "+ student.getId(),
                "| Ho va Ten: " + student.getName(),
                "| Dia chi: " + student.getAddress(),
                "| Ngay sinh: " + student.getDateOfBirth(),
                "| Gioi tinh: " + student.getGender(),
                "| Diem Toan: " + student.getPoint_subject_Math(),
                "| Diem Vat Ly: " + student.getPoint_subject_Physics(),
                "| Diem Ky Thuat: " + student.getPoint_subject_Engineering());
    }
    public String getStudentPoint(Student student){
        return String.format("%-12s%-30s%-20s%.3f","MSSV: "+ student.getId(),
                "| Ho va Ten: " + student.getName(),
                "| Diem Trung binh: ",student.getAvgPoint());
    }



    public String getStudentRank(Student student){
        return String.format("%-12s%-30s%-12s%-15s","MSSV: "+ student.getId(),
                "| Ho va Ten: " + student.getName(),
                "| Xep loai: ",student.rank());
    }
}
