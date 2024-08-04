/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mihome.education_hibernate.one_to_one.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author alekseynesterov
 */

@Table(name = "cars")
@Entity
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "year")
    private int year;
    
    @Column(name = "color")
    private String color;
    
    @Column(name = "price")
    private int price;
    
    @Column(name = "speed")
    private double speed;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "engine_id")
    private Engine carEngine; 

    public Car() {
    }

    public Car(String name, int year, String color, int price, double speed, Engine carEngine) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.carEngine = carEngine;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Engine getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(Engine carEngine) {
        this.carEngine = carEngine;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", name=" + name + ", year=" + year + ", color=" + color + ", price=" + price + ", speed=" + speed + ", carEngine=" + carEngine + '}';
    }
    
    
    
}
