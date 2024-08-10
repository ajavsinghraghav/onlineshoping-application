package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.repository;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
   // List<Product>findByBrand(String brand);
   // List<Product>findByPriceLessThan(double price);
   // Optional<Product>findById(Long id);
   // Optional<Product>save(Product product);
  //  void delete(Product product);
    //boolean exixtsById(Long id);






}
