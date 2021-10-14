package com.fashionapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashionapp.model.Brand;
import com.fashionapp.model.Category;
import com.fashionapp.model.Description;
import com.fashionapp.model.Fashion;
import com.fashionapp.service.IBrandService;
import com.fashionapp.service.ICategoryService;
import com.fashionapp.service.IDescriptionService;
import com.fashionapp.service.IFashionService;
import com.productapp.model.Product;

@RestController
@RequestMapping("/fashion-api")
public class FashionController {
	@Autowired
	IFashionService fashionService;
	@Autowired
	ICategoryService categoryService;
	@Autowired
	IBrandService brandService;
	@Autowired
	IDescriptionService descriptionService;
	
	@GetMapping("/fashion")
	public List<Fashion> getAllProducts(){
		return fashionService.getAll();
	}
	
	@PostMapping("/fashion")
	Fashion addProduct(@RequestBody Fashion fashion){
		return  fashionService.addFashion(fashion);
		
	}

	@GetMapping("/fashion/id/{id}")
	public Fashion getByid(@PathVariable("id") int id){
		return fashionService.getByFashionId(id);
	}
	
	@GetMapping("/fashion/name/{name}")
	public List<Fashion> getByName(@PathVariable("name") String name){
		return fashionService.getByName(name);
	}
	
	@GetMapping("/fashion/price/{price}/brand/{brand}")
	public List<Fashion> getByPriceAndBrand(@PathVariable("price") double price,@PathVariable("brand")String brand){
		return fashionService.getByPriceAndBrandsListBrandName(price, brand);
	}
	@GetMapping("/fashion/category/gender/{gender}")
	public List<Category>getByCategoryGender(@PathVariable("gender") String gender){
		return categoryService.getCategoryByGender(gender);
	}
	@GetMapping("/fashion/category/color/{color}")
	public List<Category>getByCategoryColor(@PathVariable("color") String color){
		return categoryService.getCategoryByColor(color);
	}
	@GetMapping("/fashion/brand/id/{id}")
	public Brand getByBrandId(@PathVariable("id") int id){
		return brandService.getById(id);
	}
	
	@GetMapping("/fashion/brand/name/{name}")
	public List<Brand> getByBrandName(@PathVariable("name") String name){
		return brandService.getByBrandName(name);
	}

	@GetMapping("/fashion/description/id/{id}")
	public Description getByDescriptionId(@PathVariable("id") int id){
		return descriptionService.getByDescriptionId(id);
	}
	@GetMapping("/fashion/description/type/{type}")
	public List<Description> getByDescriptionType(@PathVariable("type") String type){
		return descriptionService.getDescriptionByType(type);
	}
	@GetMapping("/fashion/description/material/{material}")
	public List<Description> getByDescriptionMaterial(@PathVariable("material") String material){
		return descriptionService.getDescriptionByMaterial(material);
	}
	
	
	
}
