/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nester.all.catalogue.repository;

import java.util.List;
import java.util.Optional;
import nester.all.catalogue.entity.Product;

/**
 *
 * @author alekseynesterov
 */
public interface ProductRepository {

    public List<Product> findAll();

    public Product save(Product product);

    public Optional<Product> findById(Integer productId);

    public void deleteById(Integer id);
    
}
