/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mihome.education_hibernate.one_table;

import com.mihome.education_hibernate.one_table.entity.Employee;
import jakarta.persistence.TypedQuery;
import java.security.spec.ECField;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 *
 * @author alekseynesterov
 */
public class UpdateEmployee {

    final static String SQL = "UPDATE Employee SET salary=400 WHERE salary<400";

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createMutationQuery(UpdateEmployee.SQL).executeUpdate();

            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }

}
