/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nester.all.catalogue.controller;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import nester.all.catalogue.controller.payload.NewProductPayload;
import nester.all.catalogue.entity.Product;
import nester.all.catalogue.service.ProductService;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author alekseynesterov
 */
@RestController
@RequestMapping("/catalogue-api/products")
@RequiredArgsConstructor
public class ProductsRestController {

    private final ProductService productService;
    
    private final MessageSource messageSource;

    @GetMapping
    public List<Product> findProducts() {
        return this.productService.findAllProducts();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createProduct(@Valid @RequestBody 
            NewProductPayload payload, BindingResult bindingResult,
            UriComponentsBuilder uriComponentsBuilder, Locale locale) {
        if (bindingResult.hasErrors()) {
            ProblemDetail problemDetail = ProblemDetail
                    .forStatusAndDetail(HttpStatus.BAD_REQUEST
                            , this.messageSource.getMessage("errors.400.title",
                                    new Object[0], "errors.400.title", locale));
            problemDetail.setProperty("errors", bindingResult.getAllErrors()
            .stream().map(MessageSourceResolvable::getDefaultMessage) //ObjectError
            .toList());
            return ResponseEntity.badRequest()
                    .body(problemDetail);
        } else {
            Product product = this.productService.createProduct(payload.title(),
                    payload.details());
            return ResponseEntity 
                    .created(uriComponentsBuilder
                    .replacePath("/catalogue-api/products/{productId }").
                            build(Map.of("productId", product.getId())))
                    .body(product);
        }
    }

}
