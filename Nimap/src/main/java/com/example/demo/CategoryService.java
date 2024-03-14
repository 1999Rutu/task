package com.example.demo;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
	
	 @Autowired
	    private CategoryRepository categoryRepository;
	 
//	 public List< Category> GetAllCategories()
//		{
//			List< Category> c=new ArrayList<>();
//			categoryRepository.findAll().forEach(category->c.add(category));
//			return c;
//		}
//		
//		public void AddCategory( Category category)
//		{
//			categoryRepository.save(category);
//		}
//		public  Category GetCategory(Long id)
//		{
//			return categoryRepository.findById(id).get();
//		}
//		public void updateCategory(Long id,  Category updateCategory)
//		{
//			 Category existingBook = categoryRepository.findById(id).orElse(null);
//	        if (existingBook != null) {
//	            
//	            existingBook.setName(updateCategory.getName());
//	            categoryRepository.save(existingBook);
//	        }
//		}
//		public void DeleteCategory(Long id) {
//			
//			categoryRepository.deleteById(id);
//		}
//
//	 public List<Category> getAllCategories() {
//	        List<Category> categories = new ArrayList<>();
//	        categoryRepository.findAll().forEach(category -> categories.add(category));
//	        return categories;
//	    }
//
//	    public void addCategory(Category category) {
//	        categoryRepository.save(category);
//	    }
//
//	    public Category getCategory(Long id) {
//	        return categoryRepository.findById(id).orElse(null);
//	    }
//
//	    public void updateCategory(Long id, Category updateCategory) {
//	        Category existingCategory = categoryRepository.findById(id).orElse(null);
//	        if (existingCategory != null) {
//	            existingCategory.setName(updateCategory.getName());
//	            categoryRepository.save(existingCategory);
//	        }
//	    }
//
//	    public void deleteCategory(Long id) {
//	        categoryRepository.deleteById(id);
//	    }

	 
	 public List<Category> getAllCategories() {
	        List<Category> categories = new ArrayList<>();
	        categoryRepository.findAll().forEach(category -> categories.add(category));
	        return categories;
	    }

	    public void addCategory(Category category) {
	        categoryRepository.save(category);
	    }

	    public Category getCategory(Long id) {
	        return categoryRepository.findById(id).orElse(null);
	    }

	    public void updateCategory(Long id, Category updatedCategory) {
	        Category existingCategory = categoryRepository.findById(id).orElse(null);
	        if (existingCategory != null) {
	            existingCategory.setName(updatedCategory.getName());
	            categoryRepository.save(existingCategory);
	        }
	    }

	    public void deleteCategory(Long id) {
	        categoryRepository.deleteById(id);
	    }

}
