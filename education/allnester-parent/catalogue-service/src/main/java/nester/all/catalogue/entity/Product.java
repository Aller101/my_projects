/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nester.all.catalogue.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author alekseynesterov
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    
    private Integer id;
    
    private String title;
    
    private String details;
    
    
}
