package controller;

import model.Student;
import model.StudentManager;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;


public class StudentsController {
    private final StudentManager studentManager = new StudentManager();

    public boolean checkStudentByID(String id){
        for (int i = 0; i < StudentManager.studentArrayList.size(); i++) {
            if (StudentManager.studentArrayList.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    public Student createNewStudent(String id, String name, String address, LocalDate dateOfBirth, String gender, double mathPoint, double physicsPoint, double engineeringPoint){
        return new Student(id, name, address, dateOfBirth, gender, mathPoint, physicsPoint, engineeringPoint);
    }
    public void addNewStudentToList(Student student){
        studentManager.addStudent(student);
    }
    public void updateName(String id, String name){
        for (int i = 0; i < StudentManager.studentArrayList.size(); i++) {
            Student student = StudentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.editStudentName(student, name);
            }
        }
    }
    public void updateAddress(String id, String name){
        for (int i = 0; i < StudentManager.studentArrayList.size(); i++) {
            Student student = StudentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.editStudentAddress(student, name);
            }
        }
    }
    public void updateDateOfBirth(String id, int day, int month, int year){
        for (int i = 0; i < StudentManager.studentArrayList.size(); i++) {
            Student student = StudentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                LocalDate doB = LocalDate.of(year, month, day);
                studentManager.editStudentDateOfBirth(student, doB);
            }
        }
    }
    public void updateGender(String id, String gender){
        for (int i = 0; i < StudentManager.studentArrayList.size(); i++) {
            Student student = StudentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.editStudentGender(student, gender);
            }
        }
    }
    public void updatePoint_Math(String id, double point){
        for (int i = 0; i < StudentManager.studentArrayList.size(); i++) {
            Student student = StudentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.editStudentPoint_Math(student, point);
            }
        }
    }
    public void updatePoint_Physic(String id, double point){
        for (int i = 0; i < StudentManager.studentArrayList.size(); i++) {
            Student student = StudentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.editStudentPoint_Physic(student, point);
            }
        }
    }
    public void updatePoint_Engineer(String id, double point){
        for (int i = 0; i < StudentManager.studentArrayList.size(); i++) {
            Student student = StudentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.editStudentPoint_Engineer(student, point);
            }
        }
    }

    public void deleteStudentByID(String id){
        for (int i = 0; i < StudentManager.studentArrayList.size(); i++) {
            Student student = StudentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.removeStudent(student);
            }
        }
    }
    public String showStudentInfor(String id){
        String infor ="";
        for (Student s: StudentManager.studentArrayList){
            if (s.getId().equals(id)){
              infor =  studentManager.getStudentInfor(s);
            }
        }
        return infor;

    }
    public void showStudentListByInfor(){
        for (Student student: StudentManager.studentArrayList){
            System.out.println(studentManager.getStudentInfor(student));
        }

    }
   public void showStudentListByPoint(){
       for (Student student: StudentManager.studentArrayList){
           System.out.println(studentManager.getStudentPoint(student));
       }
   }


    public void arrangeByName(){
        Collections.sort(StudentManager.studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getName().compareTo(o2.getName()));
            }
        });
    }
    public void arrangeByAvgPoint(){
        Collections.sort(StudentManager.studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAvgPoint() < o2.getAvgPoint()){
                    return 1;
                }else if (o1.getAvgPoint() == o2.getAvgPoint()){
                    return 0;
                }else return -1;
            }
        });
    }
    public void writeData(){
        studentManager.writeStudent();
    }


}
