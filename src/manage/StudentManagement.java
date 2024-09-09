package manage;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    ArrayList<Student> listStudent = new ArrayList<>();

    public void AddStudent(Student student){
        listStudent.add(student);

    }
    public void EditStudent(String newNameStudent, int id, double newGpa){
        for(Student student : listStudent){
            if(student.equals(id)){
                student.setNameStudent(newNameStudent);
                student.setGpa(newGpa);
                return;
            }
        }
        System.out.println("Student it ID" +id+"not found");
    }
    public void DeleteStudentById(int id){
        for(Student student : listStudent){
            if(student.equals(id)){
                listStudent.remove(student);
                return;
            }
        }
        System.out.println("ID "+id+" cua sinh vien da duoc xoa");
    }
    public void SearchStudentById(int id){
        for(Student student : listStudent){
            if(student.equals(id)) {
                System.out.println(student);
                return;
            }
        }
    }
    public void PrintListStudent(){
        for(Student student : listStudent){
            System.out.println(student);
            return;
        }
    }
    public void printmenu(){
        System.out.println("Student Management System");
        System.out.println("1. Add student");
        System.out.println("2. Edit student");
        System.out.println("3. Delete student by id");
        System.out.println("4. Search student by id");
        System.out.println("5. Sort student by gpa");
        System.out.println("6. Print list hoc sinh");
        System.out.println("7. Exit!!!");

    }

    public static void main(String[] args){
        StudentManagement stdMn = new StudentManagement();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            stdMn.printmenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhap ten sinh vien: ");
                    String name = sc.nextLine();
                    System.out.println("Nhap id sinh vien: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap diem trung binh: ");
                    double gpa = Double.parseDouble(sc.nextLine());
                    Student student = new Student(name, id, gpa);
                    stdMn.AddStudent(student);
                    break;
                case 2:
                    System.out.println("Nhap ten sinh vien moi: ");
                    String newNameStudent = sc.nextLine();
                    System.out.println("Nhap id sinh vien moi: ");
                    int editId = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap diem trung binh moi: ");
                    double newGpa = Double.parseDouble(sc.nextLine());
                    stdMn.EditStudent(newNameStudent, editId, newGpa);
                    break;
                case 3:
                    System.out.println("Nhap id sinh vien can xoa: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    stdMn.DeleteStudentById(deleteId);
                    break;
                case 4:
                    System.out.println("Nhap id sinh vien can tim: ");
                    int searchId = Integer.parseInt(sc.nextLine());
                    stdMn.SearchStudentById(searchId);
                    break;
                case 5:
                    break;
                case 6:
                    stdMn.PrintListStudent();
                    break;
                case 7:
                    System.out.println("Exit!!!");
                    break;
            }
        }while(choice != 7);

    }
}
