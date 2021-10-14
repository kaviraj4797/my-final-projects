package com.fashionapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashionapp.exception.ItemNotFoundException;
import com.fashionapp.model.Brand;
import com.fashionapp.model.Fashion;
import com.fashionapp.repository.IBrandRepository;
import com.fashionapp.repository.IFashionRepository;
import com.productapp.exceptions.ProductNotFoundException;

@Service
public class FashionServiceImpl implements IFashionService{
	
	@Autowired
	IFashionRepository fashionRepository;

	@Override
	public List<Fashion> getByPrice(double price) {
		return fashionRepository.findByPrice(price);
	}
	@Override
	public Fashion addFashion(Fashion fashion) {
		Fashion fsass = fashionRepository.save(fashion);
		return fsass;
	}

	@Override
	public void deleteFashion(int fashionId) {
		fashionRepository.deleteById(fashionId);
	}

	@Override
	public Fashion updateFashion(Fashion fashion) {
		return fashionRepository.save(fashion);
	}

	@Override
	public Fashion getByFashionId(int fashionId) throws ItemNotFoundException{
		// TODO Auto-generated method stub
		
		return fashionRepository.findById(fashionId).orElseThrow(() -> new ItemNotFoundException("invalid id"));
	}//findById(fashionId).get();

	@Override
	public List<Fashion> getByName(String name) throws ItemNotFoundException {
		// TODO Auto-generated method stub
		return fashionRepository.findByName(name);
	}




	@Override
	public List<Fashion> getAll() {
		// TODO Auto-generated method stub
		return fashionRepository.findAll();
	}
	@Override
	public List<Fashion> getByPriceAndBrandsListBrandName(double price, String brand) {
		// TODO Auto-generated method stub
		return fashionRepository.findByPriceLessThanAndBrandsListBrandName(price, brand);
	}




	
	
	
	

}
