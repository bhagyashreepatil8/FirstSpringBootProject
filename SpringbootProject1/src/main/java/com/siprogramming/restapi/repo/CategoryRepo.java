package com.siprogramming.restapi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siprogramming.restapi.entity.Category;
//JpaRepository have all the methods
public interface CategoryRepo extends JpaRepository<Category,Integer> {

	

	List<Category> findAll();

}
