package com.example.__Exception_handling_SpringBoot.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestControllerAdvice
public class CentralExceptionHandler {

    //@RestControllerAdvice with this annotation the methods in this class will automatically convert all response to  jSON
    @ExceptionHandler(value = StudentNotFoundException.class)
    public ExceptionInfo StudentNotFoundExceptionHandler(StudentNotFoundException e){
        return  new ExceptionInfo(HttpStatus.NOT_FOUND,e.getMessage(), LocalDateTime.now());
    }

    //@ControllerAdvice with this annotation the methods in this class will not automatically  convert all response
    // to  jSON  we have to use the @Response body also

//    @ExceptionHandler(value = StudentNotFoundException.class)
//    @ResponseBody
//    public ExceptionInfo StudentNotFoundExceptionHandler(StudentNotFoundException e){
//        return  new ExceptionInfo(HttpStatus.NOT_FOUND,e.getMessage(), LocalDateTime.now());
//    }
}
