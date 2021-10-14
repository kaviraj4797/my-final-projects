package com.fashionapp.service;

import java.util.List;

import com.fashionapp.model.Brand;


public interface IBrandService {
	void addBrand(Brand brand);
	void updateBrand(Brand brand);
	void deleteBrand(int Id);
	List<Brand> getAll();
	Brand getById(int brandId);
	List<Brand> getByBrandPrice(double price);
	List<Brand> getByBrandName(String name);
	List<Brand> getBrandByCategory(String category);
	

}
