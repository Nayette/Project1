package com.example.project1.controler;

import com.example.project1.exception.CommandException;
import com.example.project1.exception.PersonException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyAppExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PersonException.class)
    public ResponseEntity<Object> handlePersonException(PersonException he) {
        return ResponseEntity
                .status(he.getError().getCode())
                .body(he.getError().getMessage());
    }

    @ExceptionHandler(CommandException.class)
    public ResponseEntity<Object> handleCommandException(CommandException he) {
        return ResponseEntity
                .status(he.getError().getCode())
                .body(he.getError().getMessage());
    }
}