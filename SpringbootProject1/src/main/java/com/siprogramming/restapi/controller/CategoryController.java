package com.siprogramming.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.siprogramming.restapi.entity.Category;
import com.siprogramming.restapi.repo.CategoryRepo;

@RestController
public class CategoryController {
	@Autowired
	CategoryRepo repo;
	//get all categories
	@GetMapping("/categories")
	public List<Category> getAllCategory(){
		List<Category>cat=repo.findAll();
		return cat;
	}
	@GetMapping("/category/{ID}")
	public Category getCategory(@PathVariable int ID) {
		Category Cate=repo.findById(ID).get();
		return Cate;
	}
	@PostMapping("/category/add")
	public void createCategory(@RequestBody Category category) {
		repo.save(category);
	}
	@PutMapping("/category/update/{ID}")
	public Category updateCaregoryById(@PathVariable int ID) {
		Category Cate=repo.findById(ID).get();
		Cate.setCategory("Smart Phone");
		Cate.setName("Samsung");
		repo.save(Cate);
		return Cate;
	}
	@DeleteMapping("category/delete/{ID}")
	public void deleteCategoryByID(@PathVariable int ID) {
		Category Cate=repo.findById(ID).get();
		repo.delete(Cate);
		
	}
}
