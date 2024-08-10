package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.repository;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.ShirtProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShirtRepository extends JpaRepository<ShirtProduct,Long> {

}
