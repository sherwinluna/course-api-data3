package com.springbootquickstart.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Product_Subsector")
public class Product_Subsector {
	//Long sector_id;
	Long id;
	String subsector_name;
	
	@Id 
	@GeneratedValue( strategy=GenerationType.AUTO )
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubsector_name() {
		return subsector_name;
	}
	public void setSubsector_name(String subsector_name) {
		this.subsector_name = subsector_name;
	}
	
	Product_Sector product_sector;

	@ManyToOne
	@JoinColumn(name = "Product_Sector_id")
	public Product_Sector getProduct_sector() {
		return product_sector;
	}
	public void setProduct_sector(Product_Sector product_sector) {
		this.product_sector = product_sector;
	}
	
	Set<Product> product;

	@OneToMany(mappedBy = "product_subsector", cascade = CascadeType.ALL)
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
}
