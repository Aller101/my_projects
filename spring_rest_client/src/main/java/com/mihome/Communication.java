/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mihome;

import com.mihome.entity.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author alekseynesterov
 */
@Component
public class Communication {
    
    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/";
   
    public List<Employee> getAllEmployees(){
        ResponseEntity<List<Employee>> responseEntity =
                restTemplate.exchange(URL, HttpMethod.GET, null
                        , new ParameterizedTypeReference<List<Employee>>() {});
        
        List<Employee> getAlleEmployees = responseEntity.getBody();
        
        return getAlleEmployees;
    }
    
    public Employee getEmployee(int id){
        Employee employee = restTemplate.getForObject(URL+"/"+id , Employee.class);
        return employee;
    }
    
    public void saveEmployee(Employee employee){
        int id = employee.getId();
        
        if(id == 0){
            ResponseEntity<String> responseEntity =
                    restTemplate.postForEntity(URL, employee, String.class);
            System.out.println("New employee was added to DB");
            System.out.println(responseEntity.getBody());
            
        }else{
            restTemplate.put(URL, employee);
            System.out.println("Employe with ID= "+ id + " was updated");
        }
    }
    
    public void deleteEmploye(int id){
        restTemplate.delete(URL+"/"+id);
        System.out.println("Employee with ID= " + id + " was deleted from DB");
    }

   
    
}
