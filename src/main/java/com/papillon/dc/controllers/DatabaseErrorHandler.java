package com.papillon.dc.controllers;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by papillon on 5/22/2017.
 */
@ControllerAdvice
public class DatabaseErrorHandler {

    @ExceptionHandler(DataAccessException.class)
    public String handleDatabaseException(DataAccessException ex){
        System.out.println("Database internal error occured");
        return "database internal error occured while retireval of data";
    }
}
