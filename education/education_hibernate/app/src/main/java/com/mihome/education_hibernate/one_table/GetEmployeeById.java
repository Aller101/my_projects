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
public class GetEmployeeById {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            
            Employee emp = session.get(Employee.class, 2);
            
            System.out.println(emp);
            
//            emp.setSalary(650);
//
//            System.out.println(emp);
            
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }

}
