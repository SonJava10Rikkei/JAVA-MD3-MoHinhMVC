package rikkei.academy.view;

import rikkei.academy.config.Config;
import rikkei.academy.controller.StudentController;
import rikkei.academy.model.Student;

import java.util.List;

public class StudentView {
    StudentController studentController = new StudentController();

    public void showTableStudent() {
        System.out.println("*****************STUDENT MANAGE**************************");
        List<Student> studentList = studentController.showListStudent();
        System.out.println("===ID===NAME===AGE===");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("   " + studentList.get(i).getId() + "   " + studentList.get(i).getName() + "   " + studentList.get(i).getAge());
        }
        System.out.println("Enter back to comeback Menu ");
        String backMenu = Config.scanner().nextLine();
        if (backMenu.equalsIgnoreCase("back")) ;
        new Main();
    }

    public void createStudentForm() {
        while (true) {
            int id = studentController.showListStudent().get(studentController.showListStudent().size() - 1).getId() + 1;
            System.out.println("Enter the name: ");
            String name = Config.scanner().nextLine();
            System.out.println("Enter the age: ");
            int age = Config.scanner().nextInt();
            Student student = new Student(id, name, age);
            studentController.createStudent(student);
            System.out.println("Create success");

            System.out.println("Enter any key to continue create Student or back to comeback Menu ");
            String backMenu = Config.scanner().nextLine();
            if (backMenu.equalsIgnoreCase("back")) ;
            new Main();
            break;
        }
    }
}
