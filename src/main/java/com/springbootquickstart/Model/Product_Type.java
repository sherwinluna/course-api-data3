package com.springbootquickstart.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Product_Type")
public class Product_Type {
	
	//product_type_id
	//product_type
	
	Long id;
	String type;
	
	@Id 
	@GeneratedValue( strategy=GenerationType.AUTO )
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	Set<Product> product;

	@OneToMany(mappedBy = "product_type", cascade = CascadeType.ALL)
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}

}
