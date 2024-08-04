/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mihome.education_hibernate.one_to_one.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author alekseynesterov
 */

@Entity
@Table(name = "engine")
public class Engine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "horse_power")
    private int horsePower;
    
    @Column(name = "volume")
    private int volume;

    public Engine() {
    }

    public Engine(int horsePower, int volume) {
        this.horsePower = horsePower;
        this.volume = volume;
    }

    public int getId() {
        return id;
    }
    

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" + "id=" + id + ", horsePower=" + horsePower + ", volume=" + volume + '}';
    }
    
    
    
    
}
