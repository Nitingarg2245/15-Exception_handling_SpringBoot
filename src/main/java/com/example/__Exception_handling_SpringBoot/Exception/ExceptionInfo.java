package com.example.__Exception_handling_SpringBoot.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionInfo {
private HttpStatus httpStatus;
private String message;
private LocalDateTime localDateTime;
}
