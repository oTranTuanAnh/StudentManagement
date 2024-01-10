package views;

import model.ReadWriteFile;
import model.Student;
import model.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Views {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        int choice = -1;
        Scanner in = new Scanner(System.in);

        while (choice != 0){
            System.out.println("------------------------------------------------------------------");
            System.out.println("MENU");
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
                    studentManager.setStudentsList(ReadWriteFile.readFile("data.txt"));
                    Student st = studentManager.createNewStudent();
                    studentManager.insert(st);
                    ReadWriteFile.writeFile("data.txt", studentManager.getStudentsList());
                    System.out.println("Them thanh cong!!!");
                    break;
                case 2:
                    studentManager.setStudentsList(ReadWriteFile.readFile("data.txt"));
                    ArrayList<Student> list = studentManager.getStudentsList();
                    System.out.print("Nhap ID sinh vien: ");
                    String idInput = studentManager.stringInput();
                    for (int i = 0; i < list.size() ; i++) {
                        if (list.get(i).getId().equals(idInput)){

                        }

                    }


                    break;
                case 3:

                    break;
                case 4:
                    studentManager.setStudentsList(ReadWriteFile.readFile("data.txt"));
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
