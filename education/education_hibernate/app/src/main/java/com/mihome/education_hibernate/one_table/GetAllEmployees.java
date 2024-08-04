/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mihome.education_hibernate.one_table;

import com.mihome.education_hibernate.one_table.entity.Employee;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author alekseynesterov
 */
public class GetAllEmployees {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                //                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> list = session.createQuery("from Employee", Employee.class)
//                    .getResultList();
            
            List<Employee> list = session.createQuery("from Employee where salary>600", Employee.class)
                    .getResultList();

            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }

    }

}
