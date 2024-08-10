package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.controller;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.ShirtProduct;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.service.ShirtProductService;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.service.ShirtProductServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shirtproducts")
public class ShirtProductController {
    private ShirtProductServiceImpl shirtProductServiceImpl;
    public ShirtProductController(ShirtProductServiceImpl shirtProductServiceImpl ) {
        this.shirtProductServiceImpl=shirtProductServiceImpl;

    }
    @GetMapping
    public List<ShirtProduct> getAllShirtProduct(){
        return shirtProductServiceImpl.getAllShirtProduct();
    }
    @GetMapping("/{shirtProductId}")
    public Optional<ShirtProduct> getShirtProductById(@PathVariable Long shirtProductId){
        return shirtProductServiceImpl.getShirtProductById(shirtProductId);
    }

}
