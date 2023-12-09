package oop.relationships;

public class Student {
    private String name;
    private String surname;
    private String id;
    private String address;
    private int grade;

    public Student(String name, String surname, String id, String address, int grade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.address = address;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
