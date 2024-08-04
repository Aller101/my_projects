/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mihome.education_hibernate.one_table;

import com.mihome.education_hibernate.one_table.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author alekseynesterov
 */
public class DeleteEmployee {
    
    
    public static void main(String[] args) {
        
    SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Employee.class)
            .buildSessionFactory();
    
    
    try{
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        
        
        session.createMutationQuery("delete from Employee where id=5").executeUpdate();
        
        
        session.getTransaction().commit();
    }finally{
        sessionFactory.close();
    }
    
    
    
    }
}
