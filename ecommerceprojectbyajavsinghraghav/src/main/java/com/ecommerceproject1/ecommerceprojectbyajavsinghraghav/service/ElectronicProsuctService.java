package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.service;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.ElectronicProduct;

import java.util.List;
import java.util.Optional;

public interface ElectronicProsuctService {
    List<ElectronicProduct> getAllElectronicProduct();
    Optional<ElectronicProduct> getElectronicProductById(Long electronicProductid);



}
