/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nester.all.manager.controller;

import nester.all.manager.controller.payload.NewProductPayload;
import lombok.RequiredArgsConstructor;
import nester.all.manager.entity.Product;
import nester.all.manager.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    
    @GetMapping("/list")
    public String getProductsList(Model model){
        model.addAttribute("products", this.productService.findAllProducts()); 
        return "catalogue/products/list"; 
    }
    
    @GetMapping("/create")
    public String getNewProductPage(){
        return "catalogue/products/new_product"; 
    }
    
    @PostMapping("/create")
    public String createProduct(NewProductPayload payload){
        Product product = this.productService.createProduct(payload.title(), payload.details());
        return "redirect:/catalogue/products/%d".formatted(product.getId());
    }
    
    @GetMapping("/{productId:\\d+}")
    public String getProduct(@PathVariable("productId") int productId, Model model ){
        model.addAttribute("product", this.productService
                .findProduct(productId).orElseThrow());
        return "catalogue/products/product";
    }
    
}
