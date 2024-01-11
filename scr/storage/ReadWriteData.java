package storage;

import model.Student;
import model.StudentManager;

import java.util.List;

public interface ReadWriteData {
    List<Student> readData(String filename);
    void writeData(String filename, List<Student> list);
}
