package com.example.__Exception_handling_SpringBoot.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping("/student/save")
    public String saveStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
    @DeleteMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }
    @PutMapping("/student/update")
    public String updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @GetMapping("/student/fetch/{id}")
    public Student getStudent(@PathVariable Long id){
        return studentService.getStudent(id);
    }
    @GetMapping("/student/findAll")
    public List<Student> getAllStudents() {
        return  studentService.getAllStudents();
    }
}
