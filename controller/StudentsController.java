package controller;

import model.Student;
import model.StudentManager;

import java.util.ArrayList;

public class StudentsController {
    private final StudentManager studentManager = new StudentManager();
    private final ArrayList<Student> studentList = StudentManager.studentArrayList;
    public boolean checkStudentByID(String id){
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    public void deleteStudentByID(String id){
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getId().equals(id)){
                studentManager.removeStudent(student);
            }

        }

    }
    public void writeData(){
        studentManager.writeStudent();
    }


}
