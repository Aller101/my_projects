/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mihome.education_hibernate.one_to_one;

import com.mihome.education_hibernate.one_to_one.entity.Car;
import com.mihome.education_hibernate.one_to_one.entity.Engine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author alekseynesterov
 */
public class AddCar {
    
    public static void main(String[] args) {
        
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(Engine.class)
                .buildSessionFactory();
        
        
        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            
            Engine e1 = new Engine(500, 2000);
            Car c1 = new Car("Volvo", 2020, "Black", 3000, 135.7, e1);
            
            session.persist(c1);
            
            session.getTransaction().commit();
        }finally{
            factory.close();
        }
        
    }
}
