package com.fashionapp.model;
import java.util.List;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fashion {
	@Id
	@GeneratedValue(generator="fashion_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name ="fashion_gen",sequenceName="fashion_seq",initialValue=1,allocationSize=1)
	private Integer fashionId;
	@Column(name ="name",length=20)
	private String name;
	private double price;
	
	
	
	@OneToOne(orphanRemoval = true,
		    cascade = CascadeType.ALL)
	@JoinColumn(name="description_id")
	Description description;//one to one
	
	
	@ManyToMany(cascade = {
        CascadeType.PERSIST, 
        CascadeType.MERGE
    })
	@JoinTable(name="fashion_brand",joinColumns= {@JoinColumn(name="fashion_id")},inverseJoinColumns = {@JoinColumn(name="brand_id")})
	private Set<Brand> brandsList;
	
	@ManyToOne(
   
    cascade = CascadeType.ALL)
	@JoinColumn(name="category_id")
	private Category category;
	

	public Fashion(String name, double price, Category category, Set<Brand> brandsList, Description description) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.brandsList = brandsList;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Fashion [name=" + name + ", price=" + price + "]";
	}
	
	
}
	