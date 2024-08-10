package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.controller;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.Product;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
     @GetMapping("/{productId}")
    public Optional<Product> getProductById( @PathVariable Long productId){
        return productService.getProductById(productId);



    }
    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProduct();

    }
    @PostMapping
    public  Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);


    }
    @PutMapping("/{productId}")
    public  Product updateProduct(@PathVariable Long productId,@RequestBody Product product){
        return productService.updateProduct(productId,product);



    }
    @DeleteMapping("/{productId}")
    public ResponseEntity<Optional> deleteProduct(@PathVariable Long productId){
        productService.deleteProduct(productId);
        return ResponseEntity.noContent().build();

    }


}
