package com.fashionapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fashionapp.model.Category;
import com.fashionapp.model.Description;


@Repository
public interface IDescriptionRepository extends JpaRepository<Description,Integer>{

	Description findByDescriptionId(int descriptionId);
	List<Description> findDescriptionByType(String type);
	List<Description> findDescriptionByMaterial(String material);

}
