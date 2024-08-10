package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.controller;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.ElectronicProduct;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.service.ElectronicProductServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/electronicproducts")
public class ElectronicProductController {
    private ElectronicProductServiceImpl electronicproductServiceImpl;

    public ElectronicProductController(ElectronicProductServiceImpl electronicproductServiceImpl){
        this.electronicproductServiceImpl=electronicproductServiceImpl;
    }
    @GetMapping
    public List<ElectronicProduct> getAllElectronicProduct(){
        return electronicproductServiceImpl.getAllElectronicProduct();
    }
    @GetMapping("/{electronicProductId}")
    public  Optional<ElectronicProduct> getElectronicProductByid(@PathVariable Long electronicProductId){
        return electronicproductServiceImpl.getElectronicProductById(electronicProductId);
    }


}
