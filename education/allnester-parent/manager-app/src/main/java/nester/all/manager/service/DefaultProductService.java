/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nester.all.manager.service;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import nester.all.manager.entity.Product;
import nester.all.manager.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor 
public class DefaultProductService implements ProductService {
    
    private final ProductRepository productRepository;

    @Override
    public List<Product> findAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Product createProduct(String title, String details) {
        return this.productRepository.save(new Product(null, title, details)); 
    }

    @Override
    public Optional<Product> findProduct(int productId) {
        return this.productRepository.findById(productId);
    }
    
}
