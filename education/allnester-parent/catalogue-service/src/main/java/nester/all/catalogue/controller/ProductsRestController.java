/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nester.all.catalogue.controller;


import java.util.List;
import lombok.RequiredArgsConstructor;
import nester.all.catalogue.entity.Product;
import nester.all.catalogue.service.ProductService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alekseynesterov
 */
@RestController
@RequestMapping("/catalogue-api/products")
@RequiredArgsConstructor
public class ProductsRestController {
    
    private final ProductService productService;
    
    @GetMapping
    public List<Product> findProducts(){
        return this.productService.findAllProducts();
    }
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Product createProduct(){
         return null;
    }
    
}
