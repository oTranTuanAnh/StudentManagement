package controller;

import model.Student;
import model.StudentManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class StudentsController {
    private final StudentManager studentManager = new StudentManager();


    public boolean checkStudentByID(String id){
        boolean isChecked = false;
        if (!studentManager.studentArrayList.isEmpty()){
            for (int i = 0; i < studentManager.studentArrayList.size(); i++) {
                if (studentManager.studentArrayList.get(i).getId().equals(id)) {
                    isChecked =true;
                }
            }
        }
        return isChecked;

    }
    public Student createNewStudent(String id, String name, String address, LocalDate dateOfBirth, String gender, double mathPoint, double physicsPoint, double engineeringPoint){
        return new Student(id, name, address, dateOfBirth, gender, mathPoint, physicsPoint, engineeringPoint);
    }
    public void addNewStudentToList(Student student){
        studentManager.addStudent(student);
    }
    public void updateName(String id, String name){
        for (int i = 0; i < studentManager.studentArrayList.size(); i++) {
            Student student = studentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.editStudentName(student, name);
            }
        }
    }
    public void updateAddress(String id, String name){
        for (int i = 0; i < studentManager.studentArrayList.size(); i++) {
            Student student = studentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.editStudentAddress(student, name);
            }
        }
    }
    public void updateDateOfBirth(String id, int day, int month, int year){
        for (int i = 0; i < studentManager.studentArrayList.size(); i++) {
            Student student = studentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                LocalDate doB = LocalDate.of(year, month, day);
                studentManager.editStudentDateOfBirth(student, doB);
            }
        }
    }
    public void updateGender(String id, String gender){
        for (int i = 0; i < studentManager.studentArrayList.size(); i++) {
            Student student = studentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.editStudentGender(student, gender);
            }
        }
    }
    public void updatePoint_Math(String id, double point){
        for (int i = 0; i < studentManager.studentArrayList.size(); i++) {
            Student student = studentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.editStudentPoint_Math(student, point);
            }
        }
    }
    public void updatePoint_Physic(String id, double point){
        for (int i = 0; i < studentManager.studentArrayList.size(); i++) {
            Student student = studentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.editStudentPoint_Physic(student, point);
            }
        }
    }
    public void updatePoint_Engineer(String id, double point){
        for (int i = 0; i < studentManager.studentArrayList.size(); i++) {
            Student student = studentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.editStudentPoint_Engineer(student, point);
            }
        }
    }

    public void deleteStudentByID(String id){
        for (int i = 0; i < studentManager.studentArrayList.size(); i++) {
            Student student = studentManager.studentArrayList.get(i);
            if (student.getId().equals(id)){
                studentManager.removeStudent(student);
            }
        }
    }
    public String showStudentInfor(String id){
        String infor ="";
        for (Student s: studentManager.studentArrayList){
            if (s.getId().equals(id)){
              infor =  studentManager.getStudentInfor(s);
            }
        }
        return infor;

    }
    public void showStudentListByInfor(){
        for (Student student: studentManager.studentArrayList){
            System.out.println(studentManager.getStudentInfor(student));
        }

    }
   public void showStudentListByPoint(){
       for (Student student: studentManager.studentArrayList){
           System.out.println(studentManager.getStudentPoint(student));
       }
   }


    public void arrangeByName(){
        Collections.sort(studentManager.studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String name1 = o1.getName().substring(o1.getName().lastIndexOf(" ")+1);
                String name2 = o2.getName().substring(o2.getName().lastIndexOf(" ")+1);
                int compareName = name1.compareTo(name2);
                if (compareName == 0){
                    String last1 = o1.getName().substring(0,o1.getName().indexOf(" "));
                    String last2 = o2.getName().substring(0,o1.getName().indexOf(" "));
                    return last1.compareTo(last2);
                }else {
                    return compareName;
                }
            }
        });
    }
    public void arrangeByAvgPoint(){
        Collections.sort(studentManager.studentArrayList, new Comparator<Student>() {
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
    public void rankingStudentList(){
        for (Student student: studentManager.studentArrayList){
            System.out.println(studentManager.getStudentRank(student));
        }
    }
    public void writeData(){
        studentManager.writeStudent();
    }


}
