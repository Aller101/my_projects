/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nester.all.manager.service;

import java.util.List;
import java.util.Optional;
import nester.all.manager.entity.Product;

/**
 *
 * @author alekseynesterov
 */
public interface ProductService {

    public List<Product> findAllProducts();

    public Product createProduct(String title, String details);

    public Optional<Product> findProduct(int productId);
    
}
