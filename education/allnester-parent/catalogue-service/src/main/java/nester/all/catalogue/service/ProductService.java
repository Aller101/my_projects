/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nester.all.catalogue.service;

import java.util.List;
import java.util.Optional;
import nester.all.catalogue.entity.Product;

/**
 *
 * @author alekseynesterov
 */
public interface ProductService {

    public List<Product> findAllProducts();

    public Product createProduct(String title, String details);

    public Optional<Product> findProduct(int productId);

    public void updateProduct(Integer id, String title, String details);

    public void deleteProduct(Integer id);
    
}
