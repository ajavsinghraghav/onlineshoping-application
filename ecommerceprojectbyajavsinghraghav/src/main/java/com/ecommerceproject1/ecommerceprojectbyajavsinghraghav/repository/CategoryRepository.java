package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.repository;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category ,Long> {
    Optional<Category> findAllById(Long id);
    // Optional<Category> save(Category category);

}
