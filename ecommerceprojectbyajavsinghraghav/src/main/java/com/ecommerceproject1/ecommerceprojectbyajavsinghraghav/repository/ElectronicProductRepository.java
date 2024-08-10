package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.repository;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.ElectronicProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectronicProductRepository extends JpaRepository<ElectronicProduct ,Long> {

}
