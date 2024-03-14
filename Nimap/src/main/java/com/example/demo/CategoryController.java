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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(path = "/api/categories", method = RequestMethod.GET)
public class CategoryController {
	
	@Autowired
    private CategoryService categoryService;
	
	@GetMapping
	public List<Category> getAllCategories() {
	    return categoryService.getAllCategories();
	}

	@PostMapping
    public void addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
    }
	
	@GetMapping("/{id}")
    public Category getCategory(@PathVariable("id") Long id) {
        return categoryService.getCategory(id);
    }
	
	 @DeleteMapping("/{id}")
	    public void deleteCategory(@PathVariable("id") Long id) {
	        categoryService.deleteCategory(id);
	    }
	 
	 
    @PutMapping("/{id}")
    public void updateCategory(@PathVariable("id") Long id, @RequestBody Category updatedCategory) {
        categoryService.updateCategory(id, updatedCategory);
    }
}
