/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mihome.dao;

import com.mihome.entity.Employee;
import java.util.List;

/**
 *
 * @author alekseynesterov
 */
public interface EmployeeDAO {
    
    public List<Employee> getAllEmployees();
    
    public void saveEmployee(Employee employee);
    
    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
    
}
