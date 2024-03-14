package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/products", method = RequestMethod.GET)
public class ProductController {
	
	 @Autowired
	    private ProductService productService;
	 
	 @GetMapping
		public List<Category> getAllProducts() {
		    return productService.getAllProducts();
		}

		@PostMapping
		public void addProduct(@RequestBody Product product) {
	        productService.addProduct(product);
	    }
		
		@GetMapping("/{id}")
		 public Product getProduct(@PathVariable("id") Long id) {
	        return productService.getProduct(id);
	    }

		
		 @DeleteMapping("/{id}")
		    public void deleteProduct(@PathVariable("id") Long id) {
			 productService.deleteProduct(id);
		    }
		 
		 
	    @PutMapping("/{id}")
	    public void updateProduct(@PathVariable("id") Long id, @RequestBody Category updateProduct) {
	    	productService.updateProduct(id, updateProduct);
	    }

}
