package com.fashionapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashionapp.model.Category;
import com.fashionapp.repository.ICategoryRepository;

@Service
public class CategoryServiceImpl implements ICategoryService {
	
	@Autowired
	ICategoryRepository categoryRepo;

	@Override
	public Category addCategory(Category category) {
		return categoryRepo.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		return categoryRepo.save(category);
	}

	@Override
	public void deleteCategory(int categoryId) {
		categoryRepo.deleteById(categoryId);

	}

	@Override
	public List<Category> getCategoryByGender(String gender) {
		// TODO Auto-generated method stub
		return categoryRepo.findCategoryByGender(gender);
	}

	@Override
	public List<Category> getCategoryByColor(String color) {
		// TODO Auto-generated method stub
		return categoryRepo.findCategoryByColor(color);
	}

}
