/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nester.all.manager.repository;

import java.util.List;
import java.util.Optional;
import nester.all.manager.entity.Product;

/**
 *
 * @author alekseynesterov
 */
public interface ProductRepository {

    public List<Product> findAll();

    public Product save(Product product);

    public Optional<Product> findById(Integer productId);
    
}
