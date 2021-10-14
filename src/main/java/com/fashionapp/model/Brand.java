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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Brand {
	@Id
	@GeneratedValue(generator = "brand_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "brand_gen", sequenceName = "brand_seq", initialValue = 1, allocationSize = 1)
	private Integer brandId;
	@Column(length=20)
	private String brandName;//Twills,polo,PeterEngland


	@ManyToMany(fetch=FetchType.EAGER, mappedBy = "brandsList"
	    )
	@JsonIgnore
	private Set<Fashion>fashionList;//many to many

	public Brand(String brandName) {
		super();
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Brand [brandName=" + brandName + "]";
	}
	
}
