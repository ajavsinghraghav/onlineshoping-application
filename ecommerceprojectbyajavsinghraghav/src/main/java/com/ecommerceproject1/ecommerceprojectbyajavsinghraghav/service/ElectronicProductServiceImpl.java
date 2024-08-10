package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.service;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.ElectronicProduct;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.repository.ElectronicProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElectronicProductServiceImpl implements ElectronicProsuctService {
    private ElectronicProductRepository electronicProductRepository;
    public  ElectronicProductServiceImpl(ElectronicProductRepository electronicProductRepository){
        this.electronicProductRepository=electronicProductRepository;
    }
    public List<ElectronicProduct> getAllElectronicProduct(){
        return electronicProductRepository.findAll();
    }
    public Optional<ElectronicProduct> getElectronicProductById(Long electronicProductId){
        return electronicProductRepository.findById(electronicProductId);
    }

}
