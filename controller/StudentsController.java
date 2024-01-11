package controller;

import model.Student;
import model.StudentManager;

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
    public void showStudentListInfor(){
        for (Student student: StudentManager.studentArrayList){
            System.out.println(studentManager.getStudentInfor(student));
        }

    }
   public void showStudentListPoint(){
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
