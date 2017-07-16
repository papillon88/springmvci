package com.papillon.dc.controllers;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.nio.file.AccessDeniedException;

/**
 * Created by papillon on 5/22/2017.
 */
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(DataAccessException.class)
    public String handleDatabaseException(DataAccessException ex){
        System.out.println("Database internal error occured");
        return "error";
    }

    @ExceptionHandler(org.springframework.security.access.AccessDeniedException.class)
    public String handleAccessException(org.springframework.security.access.AccessDeniedException ex){
        System.out.println("unauthorized access");
        return "denied";
    }
}
