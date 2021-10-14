package com.fashionapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fashionapp.model.Brand;
import com.fashionapp.model.Category;
import com.fashionapp.model.Description;
import com.fashionapp.model.Fashion;
import com.fashionapp.service.IBrandService;
import com.fashionapp.service.ICategoryService;
import com.fashionapp.service.IDescriptionService;
import com.fashionapp.service.IFashionService;

@SpringBootApplication
public class SpringFashionappOnetooneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringFashionappOnetooneApplication.class, args);
	}

	@Autowired
	IFashionService fashionService;
	@Autowired
	IBrandService brandService;
	@Autowired
	IDescriptionService descriptionService;
	@Autowired
	ICategoryService categoryService;
	
	@Override
	public void run(String... args) throws Exception {
//	Category category = new Category("Female","blue");
//	categoryService.addCategory(category);
//	Brand brand1 = new Brand("titan");
//	brandService.addBrand(brand1);
////	Brand brand2 = new Brand("peterEngland");
////	brandService.addBrand(brand2);
//	Set<Brand> brandsList = new HashSet<>(Arrays.asList(brand1));
//	Description description = new Description("Digital","Stainless Steel");
//	descriptionService.addDescription(description);
//	Fashion fashion = new Fashion("Watch",11500,category,brandsList,description);
//	fashionService.addFashion(fashion);
		//brandService.getBrandByBrandName("Twills").forEach(System.out::println);
//		categoryService.getCategoryByGender("Male").forEach(System.out::println);
//		categoryService.getCategoryByColor("blue").forEach(System.out::println);
		
		//System.out.println(descriptionService.getByDescriptionId(3));
		//descriptionService.getDescriptionByMaterial("cotton").forEach(System.out::println);
		//descriptionService.getDescriptionByType("Digital").forEach(System.out::println);
		
		
		System.out.println(fashionService.getByFashionId(1));
	}

}
