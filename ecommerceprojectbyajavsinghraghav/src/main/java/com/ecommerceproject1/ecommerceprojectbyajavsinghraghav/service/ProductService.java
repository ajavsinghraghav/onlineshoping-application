package com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.service;

import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.exception.CategoryNotFoundException;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.exception.ProductNotFoundException;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.model.Product;
import com.ecommerceproject1.ecommerceprojectbyajavsinghraghav.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository productRepository;
    public  ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    public Optional<Product> getProductById(Long productId){
        return productRepository.findById(productId);





    }
    public List<Product> getAllProduct(){

        return productRepository.findAll();
    }
    public  Product createProduct(Product product){
        return productRepository.save(product);

    }
    public  Product updateProduct(Long productId ,Product productdetails ){
        Product existingProduct= productRepository.findById(productId)
                .orElseThrow(()->new ProductNotFoundException("product not found with  id"+productId));
            existingProduct.setName(productdetails.getName());
            existingProduct.setBrand(productdetails.getBrand());
            existingProduct.setDescription(productdetails.getDescription());
            existingProduct.setCategory(productdetails.getCategory());
            existingProduct.setPrice(productdetails.getPrice());
            existingProduct.setInventry(productdetails.getInventry());



              return productRepository.save(existingProduct);






    }
    public  void deleteProduct(Long productId){
//        Product exixtingProduct=productRepository.findById(productId)
//                .orElseThrow(()->new ProductNotFoundException("product not found with id :"+productId));
//                 productRepository.delete(exixtingProduct);
        Optional<Product>productOptional=productRepository.findById(productId);
        if(productOptional.isPresent()){
            productRepository.deleteById(productId);
        }else {
            throw new ProductNotFoundException("product not found exception"+productId+"not found" );
        }

    }

}
