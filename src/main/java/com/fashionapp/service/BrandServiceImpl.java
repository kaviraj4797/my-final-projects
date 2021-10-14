package com.fashionapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashionapp.model.Brand;
import com.fashionapp.repository.IBrandRepository;

@Service
public class BrandServiceImpl implements IBrandService {
	@Autowired
	IBrandRepository brandRepo;

	public void setBrandRepo(IBrandRepository brandRepo) {
		this.brandRepo = brandRepo;
	}

	@Override
	public void addBrand(Brand brand) {
		brandRepo.save(brand);
	}

	@Override
	public void updateBrand(Brand brand) {
		brandRepo.save(brand);
	}

	@Override
	public void deleteBrand(int Id) {
		brandRepo.deleteById(Id);

	}

	@Override
	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brandRepo.findAll();
	}

	@Override
	public Brand getById(int brandId) {
		return brandRepo.findByBrandId(brandId);
	}

	@Override
	public List<Brand> getByBrandPrice(double price) {
		// TODO Auto-generated method stub
		return null;//brandRepo.getByBrandPrice(price);
	}

	@Override
	public List<Brand> getByBrandName(String name) {
		// TODO Auto-generated method stub
		return brandRepo.findByBrandName(name);// brandRepo.getBrandByProductName(name);
	}

	@Override
	public List<Brand> getBrandByCategory(String category) {
		// TODO Auto-generated method stub
		return null;//brandRepo.getBrandByCategory(category);
	}



}
