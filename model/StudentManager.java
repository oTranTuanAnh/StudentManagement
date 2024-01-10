package model;

import storage.ReadWriteFile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private Student student;
    public static final String DATA_FILE = "data.txt";
    private static final ReadWriteFile instanceReadWrite = ReadWriteFile.getInstance();
    public static ArrayList<Student> studentArrayList = (ArrayList<Student>) instanceReadWrite.readData(DATA_FILE);

    public StudentManager() {
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
    public void editStudentByID(Student student){
        System.out.println("*******");
        System.out.println("1. Sua ho va ten");
        System.out.println("2. Sua dia chi");
        System.out.println("3. Sua ngay - thang - nam sinh");
        System.out.println("4. Sua gioi tinh");
        System.out.println("5. Sua diem toan");
        System.out.println("6. Sua diem vat ly");
        System.out.println("7. Sua diem ky thuat");
        System.out.println("0. Back");
        System.out.println("*******");
        System.out.println("NHAP LUA CHON: ");
        int inputNum = intInput();
        switch (inputNum){
            case 1:
                System.out.print("Nhap lai ho va ten: ");
                String name = stringInput();
                student.setName(name);
                break;
            case 2:
                System.out.print("Nhap lai dia chi: ");
                String address = stringInput();
                student.setAddress(address);
                break;
            case 3:
                System.out.print("Nhap lai ngay sinh: ");
                int day = intInput();
                System.out.print("Nhap lai thang sinh: ");
                int month = intInput();
                System.out.print("Nhap lai nam sinh: ");
                int year = intInput();
                LocalDate localDate = LocalDate.of(year,month,day);
                student.setDateOfBirth(localDate);
                break;
            case 4:
                System.out.print("Nhap lai gioi tinh: ");
                String gender = stringInput();
                student.setGender(gender);
                break;
            case 5:
                System.out.print("Nhap lai diem Toan: ");
                int pointMath = intInput();
                student.setPoint_subject_Math(pointMath);
                break;
            case 6:
                System.out.print("Nhap lai diem Vat ly: ");
                int pointPhysic = intInput();
                student.setPoint_subject_Physics(pointPhysic);
                break;
            case 7:
                System.out.print("Nhap lai diem Ky thuat: ");
                int pointEngineer = intInput();
                student.setPoint_subject_Engineering(pointEngineer);
                break;
            case 0:
                break;

        }

    }
    public void addStudent(Student student){
        studentArrayList.add(student);
    }
    public void removeStudent(Student student){
        studentArrayList.remove(student);
    }
    public void writeStudent(){
        instanceReadWrite.writeData(DATA_FILE,studentArrayList);
    }
    public void showStudentsList(){
        for (Student s: studentArrayList){
            System.out.println(s);
        }
    }



    public double getAvgPoint(){
        double avgPoint = (student.getPoint_subject_Engineering()+student.getPoint_subject_Math()+student.getPoint_subject_Physics())/3;
        return avgPoint;
    }

}
