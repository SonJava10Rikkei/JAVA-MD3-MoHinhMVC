package rikkei.academy.controller;

import rikkei.academy.model.Student;
import rikkei.academy.service.IStudentService;
import rikkei.academy.service.StudentServiceIMPL;

import java.util.List;

public class StudentController {

    IStudentService studentService = new StudentServiceIMPL();

    public List<Student> showListStudent() {
        return studentService.findAll();
    }

    public void createStudent(Student student) {
        studentService.save(student);
    }
}
