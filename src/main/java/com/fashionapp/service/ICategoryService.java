package com.fashionapp.service;

import java.util.List;

import com.fashionapp.model.Category;

public interface ICategoryService {

	public Category addCategory(Category category);
	public Category updateCategory(Category category);
	public void deleteCategory(int categoryId);
	List<Category> getCategoryByGender(String gender);
	 List<Category> getCategoryByColor(String color);
}
