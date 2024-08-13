/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nester.all.manager.controller;

import lombok.RequiredArgsConstructor;
import nester.all.manager.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alekseynesterov
 */
@Controller 
@RequiredArgsConstructor 
@RequestMapping("catalogue/products")
public class ProductsController {
    
    private final ProductService productService;
    
    @GetMapping("/")
    public String getProductsList(Model model){
        model.addAttribute("products", this.productService.findAllProducts()); 
        return "catalogue/products/list"; 
    }
    
}
