package model;

public class Student {
    private String nameStudent;
    private int id;
    private double gpa;


    public Student(String nameStudent, int id) {
        this.nameStudent = nameStudent;
        this.id = id;
    }

    public Student(String nameStudent, int id, double gpa) {
        this.nameStudent = nameStudent;
        this.id = id;
        this.gpa = gpa;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }
}
