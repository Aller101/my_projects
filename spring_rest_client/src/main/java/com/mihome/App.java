package com.mihome;

import com.mihome.configuration.MyConfig;
import com.mihome.entity.Employee;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(MyConfig.class);
        
        Communication communication = context.getBean("communication",  
                Communication.class);
        
        //get all employees
        
        List<Employee> emp = communication.getAllEmployees();       
        System.out.println(emp);
        
        //get employee by id
        
//        Employee employeeById = communication.getEmployee(1);
//        System.out.println(employeeById);
        
        //create new employee
        
//        Employee employee = new Employee("Nada", "Pushcina", "Magnit", 450);
//        communication.saveEmployee(employee);
        
        //update by id
        
//        Employee employee = new Employee("Nada", "Pushcina", "IT", 890);
//        employee.setId(write id here);
//        communication.saveEmployee(employee);

        //delete by id

//        communication.deleteEmploye(write id here);
        
        context.close();
        
    }
}
