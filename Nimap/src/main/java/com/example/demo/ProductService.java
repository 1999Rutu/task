package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
@Service
public class ProductService {
	 @Autowired
	    private ProductRepository productRepository;
	    @Autowired
	    private CategoryRepository categoryRepository;
	    
	    public List<Category> getAllProducts() {
	        List<Category> p = new ArrayList<>();
	        categoryRepository.findAll().forEach(category -> p.add(category));
	        return p;
	    }

	    public void addProduct(Product product) {
	        productRepository.save(product);
	    }


//	    public Category getProduct(Long id) {
//	        return categoryRepository.findById(id).orElse(null);
//	    }
//	    public Product getProduct(Long id) {
//	        return productRepository.findById(id).orElse(null);
//	    }
	    public Product getProduct(Long id) {
	        Product product = productRepository.findById(id).orElse(null);
	        if (product == null) {
	            throw new EntityNotFoundException("Product with ID " + id + " not found");
	        }
	        return product;
	    }

	    public void updateProduct(Long id, Category updateProduct) {
	        Category existingCategory = categoryRepository.findById(id).orElse(null);
	        if (existingCategory != null) {
	            existingCategory.setName(updateProduct.getName());
	            categoryRepository.save(existingCategory);
	        }
	    }

	    public void deleteProduct(Long id) {
	        categoryRepository.deleteById(id);
	    }


}
