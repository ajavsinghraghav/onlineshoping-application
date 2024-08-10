package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.service;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.ShirtProduct;

import java.util.List;
import java.util.Optional;

public interface ShirtProductService {
    List<ShirtProduct> getAllShirtProduct();
    Optional<ShirtProduct> getShirtProductById(Long shirtProductId);

}
