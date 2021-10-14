package com.fashionapp.repository;


import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fashionapp.model.Brand;
import com.fashionapp.model.Description;
import com.fashionapp.model.Fashion;

@Repository
public interface IFashionRepository extends JpaRepository<Fashion,Integer>{

	Fashion findByFashionId(int fashionId);
	List<Fashion> findByName(String name);
	List<Fashion> findByPrice(double price);
	//@Query("select * from Fashion f innerjoin f.brandsList b where f.price=?1 and b.brandName=?2")
	List<Fashion>findByPriceLessThanAndBrandsListBrandName(double price,String brandName);
}
