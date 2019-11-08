package com.springbootquickstart.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Product_Team")
public class Product_Team {
	//Long product_id;
	//String product_number;
	Long id;
	//String primary_officer;
	String primary_analyst;
	String alternate_officer;
	String alternate_analyst;
	String processing_assistant;
	String team_lead;
	
	@Id 
	@GeneratedValue( strategy=GenerationType.AUTO )
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
//	public String getPrimary_officer() {
//		return primary_officer;
//	}
//	public void setPrimary_officer(String primary_officer) {
//		this.primary_officer = primary_officer;
//	}
	public String getPrimary_analyst() {
		return primary_analyst;
	}
	public void setPrimary_analyst(String primary_analyst) {
		this.primary_analyst = primary_analyst;
	}
	public String getAlternate_officer() {
		return alternate_officer;
	}
	public void setAlternate_officer(String alternate_officer) {
		this.alternate_officer = alternate_officer;
	}
	public String getAlternate_analyst() {
		return alternate_analyst;
	}
	public void setAlternate_analyst(String alternate_analyst) {
		this.alternate_analyst = alternate_analyst;
	}
	public String getProcessing_assistant() {
		return processing_assistant;
	}
	public void setProcessing_assistant(String processing_assistant) {
		this.processing_assistant = processing_assistant;
	}
	public String getTeam_lead() {
		return team_lead;
	}
	public void setTeam_lead(String unit_lead) {
		this.team_lead = unit_lead;
	}
	
	Product product;

	@ManyToOne
	@JoinColumn(name = "Product_id")
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	Staff staff;
	
	@ManyToOne
	@JoinColumn(name = "primary_officer", referencedColumnName = "id")
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	
}
