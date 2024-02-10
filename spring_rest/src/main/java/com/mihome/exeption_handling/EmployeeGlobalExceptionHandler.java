/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mihome.exeption_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author alekseynesterov
 */
@ControllerAdvice
public class EmployeeGlobalExceptionHandler {
    
    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleExeption(
    NoSuchEmployeeExeption exeption){
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exeption.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleExeption(
    Exception exeption){
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exeption.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
    
}
