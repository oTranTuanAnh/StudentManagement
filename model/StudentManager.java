package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> studentsList;

    public StudentManager() {
    }
    public StudentManager(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
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
    public Student createNewStudent(){
        System.out.print("Nhap ma sinh vien: ");
        String id = stringInput();
        System.out.print("Nhap ho va ten: ");
        String name = stringInput();
        System.out.print("Nhap dia chi: ");
        String address = stringInput();
        System.out.print("Nhap ngay sinh: ");
        int day = intInput();
        System.out.print("Nhap thang sinh: ");
        int month = intInput();
        System.out.print("Nhap nam sinh: ");
        int year = intInput();
        LocalDate dateOfBirth = LocalDate.of(year,month,day);
        System.out.print("Nhap gioi tinh (nam/nu): ");
        String gender = stringInput();
        System.out.print("Nhap diem mon Toan: ");
        double mathPoint = doubleInput();
        System.out.print("Nhap diem mon Vat ly: ");
        double physicsPoint = doubleInput();
        System.out.print("Nhap diem mon Ky thuat: ");
        double engineeringPoint = doubleInput();
        return new Student(id, name, address, dateOfBirth, gender, mathPoint, physicsPoint, engineeringPoint);
    }
    public void editStudentByID(String id){
        System.out.println("*******");
        System.out.println("1. Sua ho va ten");
        System.out.println("2. Sua dia chi");
        System.out.println("3. Sua ngay - thang - nam sinh");
        System.out.println("4. Sua gioi tinh");
        System.out.println("5. Sua diem toan");
        System.out.println("6. Sua diem vat ly");
        System.out.println("7. Sua diem ky thuat");
        System.out.println("*******");
        System.out.println("NHAP LUA CHON: ");
        int inputNum = intInput();
        switch (inputNum){
            case 1:

        }

    }




    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }
    public void insert(Student student){
        this.studentsList.add(student);
    }
    public void delete(Student student){
        this.studentsList.remove(student);
    }
    public void update(Student student){
        this.studentsList.remove(student);
        this.studentsList.add(student);
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }
    public void showStudentsList(){
        for (Student s: this.studentsList){
            System.out.println(s);
        }
    }

    private Student student;

    public double getAvgPoint(){
        double avgPoint = (student.getPoint_subject_Engineering()+student.getPoint_subject_Math()+student.getPoint_subject_Physics())/3;
        return avgPoint;
    }

}