package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.service;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.ShirtProduct;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.repository.ShirtRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShirtProductServiceImpl implements ShirtProductService{

    private ShirtRepository shirtRepository;
    public ShirtProductServiceImpl(ShirtRepository shirtRepository){
        this.shirtRepository=shirtRepository;
    }
    public List<ShirtProduct> getAllShirtProduct(){
        return shirtRepository.findAll();
    }
    public Optional<ShirtProduct> getShirtProductById(Long shirtProductId){
        return shirtRepository.findById(shirtProductId);

    }



}
