package com.fashionapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Description {

	@Id
	@GeneratedValue(generator = "desc_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "desc_gen", sequenceName = "desc_seq", initialValue = 1, allocationSize = 1)
	private Integer descriptionId;
	@Column(length = 20)
	private String type;// tshirt,pant,etc..
	@Column(length = 20)
	private String material;// cotton,silk,etc..
    
	
	@OneToOne(mappedBy = "description")
	@JsonIgnore
	private Fashion fashion;

	public Description(String type, String material) {
		super();
		this.type = type;
		this.material = material;
	}

	@Override
	public String toString() {
		return "Description [type=" + type + ", material=" + material + ", fashion=" + fashion + "]";
	}
	
}
