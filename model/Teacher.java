package model;

import java.time.LocalDate;

public class Teacher extends Person{
    private String title;
    private double salary;

    public Teacher() {
    }

    public Teacher(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public Teacher(String id, String name, String address, LocalDate dateOfBirth, boolean sexual, String title, double salary) {
        super(id, name, address, dateOfBirth, sexual);
        this.title = title;
        this.salary = salary;
    }

    @Override
    public String showInfor() {
        return "Teacher{" +
                super.toString()+
                "title='" + title +
                ", salary=" + salary +
                '}';
    }
}
