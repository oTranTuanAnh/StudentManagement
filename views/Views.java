package views;

import controller.StudentsController;

import java.time.LocalDate;
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
//        StudentManager studentManager = new StudentManager();
//        ArrayList<Student> studentArrayList = StudentManager.studentArrayList;
        StudentsController controller = new StudentsController();
        int choice = -1;
        Scanner in = new Scanner(System.in);

        while (choice != 0){
            System.out.println("--------------------------------------------------------");
            System.out.println("________******MENU*****________");
            System.out.println("1. Them moi sinh vien");System.out.println("2. Sua thong tin sinh vien");System.out.println("3. Xoa sinh vien");
            System.out.println("4. Hien thi danh sach sinh vien");System.out.println("5. Tim kiem sinh vien theo MSSV");System.out.println("6. Sap xep sinh vien");
            System.out.println("0. Exit");System.out.print("NHAP LUA CHON CUA BAN: ");
            choice = in.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Nhap ma sinh vien: ");String id = stringInput();
                    if (controller.checkStudentByID(id)){
                        System.out.println("Sinh vien da ton tai!!  MOI NHAP LAI.");
                        break;
                    }else {
                        System.out.print("Nhap ho va ten: ");String name = stringInput();
                        System.out.print("Nhap dia chi: ");String address = stringInput();
                        System.out.print("Nhap ngay sinh: ");int day = intInput();
                        System.out.print("Nhap thang sinh: ");int month = intInput();
                        System.out.print("Nhap nam sinh: ");int year = intInput();
                        LocalDate dateOfBirth = LocalDate.of(year,month,day);
                        System.out.print("Nhap gioi tinh (nam/nu): ");String gender = stringInput();
                        System.out.print("Nhap diem mon Toan: ");double mathPoint = doubleInput();
                        System.out.print("Nhap diem mon Vat ly: ");double physicsPoint = doubleInput();
                        System.out.print("Nhap diem mon Ky thuat: ");double engineeringPoint = doubleInput();
                        controller.addNewStudentToList(controller.createNewStudent(id, name, address, dateOfBirth, gender, mathPoint, physicsPoint, engineeringPoint));
                        controller.writeData();
                        System.out.println("Them thanh cong!!!");
                    }
                    break;
                case 2:
                    System.out.print("Nhap ma so sinh vien: ");
                    String idToEdit = stringInput();
                    if (controller.checkStudentByID(idToEdit)){
                        int inputCase2 = 0;
                        do {
                            System.out.println("_________________CAC LUA CHON SUA THONG TIN_______________");
                            System.out.println("1. Sua ho va ten");System.out.println("2. Sua dia chi");
                            System.out.println("3. Sua ngay - thang - nam sinh");System.out.println("4. Sua gioi tinh");
                            System.out.println("5. Sua diem toan");System.out.println("6. Sua diem vat ly");
                            System.out.println("7. Sua diem ky thuat");System.out.println("0. Back");
                            System.out.print("Nhap lua chon: ");
                            inputCase2 = intInput();
                            if (inputCase2 == 0){
                                break;
                            }
                            switch (inputCase2){
                                case 1:
                                    System.out.print("Nhap lai ten sinh vien: ");
                                    String reName = stringInput();
                                    controller.updateName(idToEdit, reName);
                                    controller.writeData();
                                    break;
                                case 2:
                                    System.out.print("Nhap lai dia chi: ");
                                    String reAddress = stringInput();
                                    controller.updateAddress(idToEdit, reAddress);
                                    controller.writeData();
                                    break;
                                case 3:
                                    System.out.print("Nhap lai ngay sinh: ");int reDay = intInput();
                                    System.out.print("Nhap lai thang sinh: ");int reMonth = intInput();
                                    System.out.print("Nhap lai nam sinh: ");int reYear = intInput();
                                    controller.updateDateOfBirth(idToEdit, reDay, reMonth, reYear);
                                    controller.writeData();
                                    break;
                                case 4:
                                    System.out.print("Nhap lai dia chi: ");String reGender = stringInput();
                                    controller.updateGender(idToEdit, reGender);
                                    controller.writeData();
                                    break;
                                case 5:
                                    System.out.print("Nhap lai diem Toan: ");double reMathPoint = doubleInput();
                                    controller.updatePoint_Math(idToEdit, reMathPoint);
                                    controller.writeData();
                                    break;
                                case 6:
                                    System.out.print("Nhap lai diem Vat ly: ");double rePhysicPoint = doubleInput();
                                    controller.updatePoint_Math(idToEdit, rePhysicPoint);
                                    controller.writeData();
                                    break;
                                case 7:
                                    System.out.print("Nhap lai diem Toan: ");double reEngiPoint = doubleInput();
                                    controller.updatePoint_Math(idToEdit, reEngiPoint);
                                    controller.writeData();
                                    break;
                            }
                            System.out.println("SUA THANH CONG!!!");

                        }while (true);

                    }
                    break;
                case 3:
                    System.out.print("Nhap ma so sinh vien: ");
                    String idToDelete = stringInput();
                    if (controller.checkStudentByID(idToDelete)){
                        controller.deleteStudentByID(idToDelete);
                        controller.writeData();
                        System.out.println("XOA THANH CONG!!!");
                    } else {
                        System.out.println("KHONG TON TAI SINH VIEN");
                    }
                    break;
                case 4:
                    System.out.println("__________________________DANH SACH SINH VIEN__________________________");
                    int inputCase4 = 0;
                     do {
                        System.out.println("1. Danh sach Thong tin sinh vien");
                        System.out.println("2. Danh sach Diem trung binh cua sinh vien");
                        System.out.println("0. Quay lai");
                        System.out.print("Nhap lua chon: ");
                        inputCase4 = intInput();
                        if (inputCase4 == 0){
                            break;
                        }
                        switch (inputCase4){
                            case 1:
                                System.out.println("_____________STUDENTS INFORMATION____________");
                                controller.showStudentListByInfor();
                                break;
                            case 2:
                                System.out.println("_____________STUDENTS AVERAGE POINT____________");
                                controller.showStudentListByPoint();
                                break;
                        }

                    }while (true);
                    break;
                case 5:
                    System.out.print("Nhap ma so sinh vien can tim: ");
                    String idToFind = stringInput();
                    if (controller.checkStudentByID(idToFind)){
                        System.out.println("Tim thay sinh vien: ");
                        System.out.println(controller.showStudentInfor(idToFind));
                    } else {
                        System.out.println("Khong tim thay!");
                    }
                    break;
                case 6:
                    System.out.println("___________________CAC LUA CHON SAP XEP___________________");
                    int inputCase6 = 0;
                    do {
                        System.out.println("1. Sap xep theo ten");
                        System.out.println("2. Sap xep theo diem trung binh");
                        System.out.println("0. Quay lai.");
                        System.out.print("Nhap lua chon: ");
                        inputCase6 = intInput();
                        if (inputCase6 == 0){
                            break;
                        }
                        switch (inputCase6){
                            case 1:
                                controller.arrangeByName();
                                System.out.println("_____________DANH SACH SAP XEP THEO TEN____________");
                                controller.showStudentListByInfor();
                                controller.writeData();
                                break;
                            case 2:
                                controller.arrangeByAvgPoint();
                                System.out.println("_____________DANH SACH SAP XEP THEO DIEM TRUNG BINH____________");
                                controller.showStudentListByPoint();
                                controller.writeData();
                                break;
                        }

                    }while (true);
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
