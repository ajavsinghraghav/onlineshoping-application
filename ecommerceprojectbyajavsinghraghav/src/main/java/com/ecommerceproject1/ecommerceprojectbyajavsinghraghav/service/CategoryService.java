package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.service;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.exception.CategoryNotFoundException;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.Category;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.lang.Long;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;
    public  CategoryService(CategoryRepository categoryRepository){

        this.categoryRepository=categoryRepository;
    }
    public  Optional<Category>  getCategoryById(Long id){
        return categoryRepository.findAllById(id);


    }
    public List<Category> getAllcategories(){
        return categoryRepository.findAll();

    }
    public  Category createCategory(Category category){
        return  categoryRepository.save(category);
    }
    public  Category updatecategory(Long categoryId,Category categoryDetails){
        Category existingCategory=categoryRepository.findAllById(categoryId)
                .orElseThrow(()->new CategoryNotFoundException("category not found exception with id :"+categoryId));
             existingCategory.setCategoryName(categoryDetails.getCategoryName());
             return categoryRepository.save(existingCategory);

    }

    public  void deletecategory(Long categoryId){
        Optional<Category>categoryOptional=categoryRepository.findById(categoryId);
        if(categoryOptional.isPresent()){
            categoryRepository.deleteById(categoryId);
        }else {
            throw  new CategoryNotFoundException(("category with "+categoryId+"not found"));

        }




    }




}
