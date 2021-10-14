package com.fashionapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category {

	@Id
	@GeneratedValue(generator = "category_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "category_gen", sequenceName = "category_seq", initialValue = 100, allocationSize = 1)
	private int categoryId;
	@Column(length=20)
	private String gender;//male,female
	@Column(length=20)
	private String color;//red,blue,green..etc
	
	

	@OneToMany(mappedBy="category")
	@JsonIgnore
	private Set<Fashion> fashionList;//one to many



	public Category(String gender, String color) {
		super();
		this.gender = gender;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Category [gender=" + gender + ", color=" + color + "]";
	}
	
	
}
