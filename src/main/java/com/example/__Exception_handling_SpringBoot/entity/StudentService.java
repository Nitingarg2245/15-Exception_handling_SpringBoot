package com.example.__Exception_handling_SpringBoot.entity;

import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    public String createStudent(Student student);
    public String updateStudent(Student student);
    public String deleteStudent(Long id);
    public Student getStudent(Long id);
    public List<Student> getAllStudents();
}
