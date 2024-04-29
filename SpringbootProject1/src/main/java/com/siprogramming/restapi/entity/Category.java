package com.siprogramming.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
@Table(name ="category")
public class Category {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  @Column
  private String name;
  @Column
  private String category;
  
  public Category(){
	  
  }
  
public Category(String name, String category) {
	super();
	this.name = name;
	this.category = category;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
@Override
public String toString() {
	return "Category [id=" + id + ", name=" + name + ", category=" + category + "]";
}
  
  
  
}
