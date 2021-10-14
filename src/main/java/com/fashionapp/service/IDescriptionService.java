package com.fashionapp.service;

import java.util.List;

import com.fashionapp.model.Description;

public interface IDescriptionService {

	public Description addDescription(Description description);
	public Description updateDescription(Description description);
	public void deleteDescription(int descriptionId);
	Description getByDescriptionId(int descriptionId);
	List<Description> getDescriptionByType(String type);
	List<Description> getDescriptionByMaterial(String material);

}
