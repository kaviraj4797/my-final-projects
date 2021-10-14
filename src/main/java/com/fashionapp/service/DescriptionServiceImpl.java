package com.fashionapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashionapp.model.Description;
import com.fashionapp.repository.IDescriptionRepository;

@Service
public class DescriptionServiceImpl implements IDescriptionService {
	
	@Autowired
	IDescriptionRepository descriptionRepo;

	@Override
	public Description addDescription(Description description) {
		return descriptionRepo.save(description);
	}

	@Override
	public Description updateDescription(Description description) {
		return descriptionRepo.save(description);
	}

	@Override
	public void deleteDescription(int descriptionId) {
		descriptionRepo.deleteById(descriptionId);
	}

	@Override
	public Description getByDescriptionId(int descriptionId) {
		// TODO Auto-generated method stub
		return descriptionRepo.findByDescriptionId(descriptionId);
	}

	@Override
	public List<Description> getDescriptionByType(String type) {
		// TODO Auto-generated method stub
		return descriptionRepo.findDescriptionByType(type);
	}

	@Override
	public List<Description> getDescriptionByMaterial(String material) {
		// TODO Auto-generated method stub
		return descriptionRepo.findDescriptionByMaterial(material);
	}

}
