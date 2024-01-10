package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadWriteFile {

    public static void writeFile(String path, ArrayList<Student> list){
        File file = new File(path);
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
    public static ArrayList<Student> readFile(String path){
        File file = new File(path);
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
}
