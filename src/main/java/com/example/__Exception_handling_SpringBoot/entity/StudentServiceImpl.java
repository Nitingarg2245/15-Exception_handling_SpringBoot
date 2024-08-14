package com.example.__Exception_handling_SpringBoot.entity;

import com.example.__Exception_handling_SpringBoot.Exception.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String createStudent(Student student) {
        studentRepo.save(student);
        return "Student is saved";
    }

    @Override
    public String updateStudent(Student student) {
        studentRepo.save(student);
        return "Student is updated";

    }

    @Override
    public String deleteStudent(Long id) {
        studentRepo.deleteById(id);
        return "Student is deleted ";
    }

    @Override//exception is thrown here as it is an unchecked exception so we can handle it at run time
    public Student getStudent(Long id) {
        Optional<Student> optional = studentRepo.findById(id);
        if(optional.isEmpty())throw  new StudentNotFoundException("entered id is not matched with any student in db");
        else return optional.get();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

}
