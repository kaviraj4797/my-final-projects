package com.fashionapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fashionapp.model.Brand;

@Repository
public interface IBrandRepository extends JpaRepository<Brand,Integer>{
//	List<Brand>findByBrand(String brand);
//	List<Brand> findByBrandPrice(double price);
//	List<Brand> findBrandByProductName(String name);
//	List<Brand> findBrandByCategory(String category);
	
	List<Brand> findByBrandName(String brandName);
	Brand findByBrandId(int brandId);
	
	
	
	
}
