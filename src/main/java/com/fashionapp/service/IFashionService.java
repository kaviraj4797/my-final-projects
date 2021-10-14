package com.fashionapp.service;

import java.util.List;

import com.fashionapp.exception.ItemNotFoundException;
import com.fashionapp.model.Brand;
import com.fashionapp.model.Fashion;

public interface IFashionService {
	
	Fashion addFashion(Fashion fashion);
	void deleteFashion(int fashionId);
	Fashion updateFashion(Fashion fashion);

	List<Fashion> getAll();
	Fashion getByFashionId(int fashionId) throws ItemNotFoundException;
	List<Fashion> getByName(String name) throws ItemNotFoundException;
	List<Fashion> getByPrice(double price) throws ItemNotFoundException;
	//List<Fashion> getByCategory(String name);
	//List<Fashion> getByBrand(String brand) ;
	List<Fashion>getByPriceAndBrandsListBrandName(double price,String brand);
}
