package views;

import controller.StudentsController;
import model.Student;
import model.StudentManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Views {
    public static int intInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static double doubleInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    public static String stringInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        ArrayList<Student> studentArrayList = StudentManager.studentArrayList;
        StudentsController controller = new StudentsController();
        int choice = -1;
        Scanner in = new Scanner(System.in);

        while (choice != 0){
            System.out.println("--------------------------------------------------------");
            System.out.println("___MENU___");
            System.out.println("1. Them moi sinh vien");
            System.out.println("2. Sua thong tin sinh vien");
            System.out.println("3. Xoa sinh vien");
            System.out.println("4. Hien thi danh sach sinh vien");
            System.out.println("5. Tim kiem sinh vien theo ID");
            System.out.println("6. Sap xep sinh vien");
            System.out.println("0. Exit");
            System.out.print("NHAP LUA CHON CUA BAN: ");
            choice = in.nextInt();

            switch (choice){
                case 1:
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
                    Student st = new Student(id, name, address, dateOfBirth, gender, mathPoint, physicsPoint, engineeringPoint);
                    studentManager.addStudent(st);
                    studentManager.writeStudent();
                    System.out.println("Them thanh cong!!!");
                    break;
                case 2:
                    System.out.print("Nhap ID sinh vien: ");
                    String idInput = studentManager.stringInput();
                    for (Student s: studentArrayList){
                        if (s.getId().equals(idInput)){
                        studentManager.editStudentByID(s);
                        System.out.println("SUA THANH CONG!!!");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap ID sinh vien: ");
                    String idToDelete = studentManager.stringInput();
                    if (controller.checkStudentByID(idToDelete)){
                        controller.deleteStudentByID(idToDelete);
                        controller.writeData();
                        System.out.println("XOA THANH CONG!!!");
                    } else {
                        System.out.println("KHONG TON TAI SINH VIEN");
                    }

                    break;
                case 4:
                    studentManager.showStudentsList();
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
