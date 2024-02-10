/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mihome.exeption_handling;

/**
 *
 * @author alekseynesterov
 */
public class NoSuchEmployeeExeption extends RuntimeException {

    public NoSuchEmployeeExeption(String message) {
        super(message);
    }

}
