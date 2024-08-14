package com.example.__Exception_handling_SpringBoot.Exception;

public class StudentNotFoundException  extends RuntimeException{

    public StudentNotFoundException(String message) {
        super(message);
    }
}
