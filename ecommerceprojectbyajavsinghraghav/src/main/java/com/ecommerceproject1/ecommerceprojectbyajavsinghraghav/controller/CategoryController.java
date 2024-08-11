package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.controller;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.exception.CategoryNotFoundException;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.Category;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private CategoryService categoryService;
    public CategoryController(CategoryService categoryService){

        this.categoryService=categoryService;

        System.out.println(" this our categorycontroller");

    }
@GetMapping("/{id}")
    public ResponseEntity<Long> getCategoryById(@PathVariable Long id ) {
        Category category=categoryService.getCategoryById(id)
                .orElseThrow(()->new CategoryNotFoundException("category not found exception with id : +id"));

        return ResponseEntity.ok(id);
    }
    @GetMapping
    public List<Category> getAllCategory(){

        return categoryService.getAllcategories();
    }
    @PostMapping
    public ResponseEntity<Category>  createCategory(@RequestBody Category category){
        Category createdCategory=categoryService.createCategory(category);
        return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);

    }
    @PutMapping("/{categoryId}")
    public ResponseEntity<Category> updateCategory(@PathVariable  Long categoryId,Category categoryDetails){
        Category updatedCategory=categoryService.updatecategory(categoryId,categoryDetails);
        return  ResponseEntity.ok(updatedCategory);

    }
    public  ResponseEntity<Optional> deleateCategory(@PathVariable Long categorId){
        categoryService.deletecategory(categorId);
        return ResponseEntity.noContent().build();
    }


}
