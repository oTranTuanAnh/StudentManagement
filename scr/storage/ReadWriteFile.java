package storage;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadWriteFile implements ReadWriteData{
    private static ReadWriteFile instance;

    private ReadWriteFile() {
    }

    public static ReadWriteFile getInstance(){
        if (instance == null){
            synchronized (ReadWriteFile.class){
                if (instance == null) {
                instance = new ReadWriteFile();
                }
            }
        }
        return instance;
    }

    @Override
    public List<Student> readData(String filename) {
        File file = new File(filename);
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            ArrayList<Student> list = null;
            list = (ArrayList<Student>) ois.readObject();
            return list;
        } catch (FileNotFoundException e) {
            return new ArrayList<Student>();
        } catch (IOException e) {
            return new ArrayList<Student>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Student>();
        }
    }

    @Override
    public void writeData(String filename, List<Student> list) {
        File file = new File(filename);
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(list);
            oos.close();
            os.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
