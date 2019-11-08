package com.springbootquickstart.Model;

import java.util.Date;
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
@Table(name = "Product")
public class Product {
	Long id;
	//Long product_id;
	String product_number;
	String product_name;
	//String sector;
	//String subsector;
	//Long country_id;
	Date date_approved;
	Double approved_amount;
	//Long product_type_id;
	//Long financing_plan_id;
	//Long fund_source_id;
	//Long product_status_id;
	Long project_id;
	//String project_number;
	Date date_signed;
	Date date_effectivity;
	Date date_closing;
	Date date_closing_current;
	Date date_closed_actual;
	Boolean Delegated_Flag;
	Date as_of_date;
	Boolean LockRecord;
	Double net_amount;
	Date Closed_Project;
	String CreatedBy;
	Date CreatedDate;
	String LastModifiedBy;
	Date LastModifiedDate;
	Date date_closed;
	
	@Id 
	@GeneratedValue( strategy=GenerationType.AUTO )
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProduct_number() {
		return product_number;
	}
	public void setProduct_number(String product_number) {
		this.product_number = product_number;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Date getDate_approved() {
		return date_approved;
	}
	public void setDate_approved(Date date_approved) {
		this.date_approved = date_approved;
	}
	public Double getApproved_amount() {
		return approved_amount;
	}
	public void setApproved_amount(Double approved_amount) {
		this.approved_amount = approved_amount;
	}
	public Long getProject_id() {
		return project_id;
	}
	public void setProject_id(Long project_id) {
		this.project_id = project_id;
	}
	public Date getDate_signed() {
		return date_signed;
	}
	public void setDate_signed(Date date_signed) {
		this.date_signed = date_signed;
	}
	public Date getDate_effectivity() {
		return date_effectivity;
	}
	public void setDate_effectivity(Date date_effectivity) {
		this.date_effectivity = date_effectivity;
	}
	public Date getDate_closing() {
		return date_closing;
	}
	public void setDate_closing(Date date_closing) {
		this.date_closing = date_closing;
	}
	public Date getDate_closing_current() {
		return date_closing_current;
	}
	public void setDate_closing_current(Date date_closing_current) {
		this.date_closing_current = date_closing_current;
	}
	public Date getDate_closed_actual() {
		return date_closed_actual;
	}
	public void setDate_closed_actual(Date date_closed_actual) {
		this.date_closed_actual = date_closed_actual;
	}
	public Boolean getDelegated_Flag() {
		return Delegated_Flag;
	}
	public void setDelegated_Flag(Boolean delegated_Flag) {
		Delegated_Flag = delegated_Flag;
	}
	public Date getAs_of_date() {
		return as_of_date;
	}
	public void setAs_of_date(Date as_of_date) {
		this.as_of_date = as_of_date;
	}
	public Boolean getLockRecord() {
		return LockRecord;
	}
	public void setLockRecord(Boolean lockRecord) {
		LockRecord = lockRecord;
	}
	public Double getNet_amount() {
		return net_amount;
	}
	public void setNet_amount(Double net_amount) {
		this.net_amount = net_amount;
	}
	public Date getClosed_Project() {
		return Closed_Project;
	}
	public void setClosed_Project(Date closed_Project) {
		Closed_Project = closed_Project;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	public Date getCreatedDate() {
		return CreatedDate;
	}
	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}
	public String getLastModifiedBy() {
		return LastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		LastModifiedBy = lastModifiedBy;
	}
	public Date getLastModifiedDate() {
		return LastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		LastModifiedDate = lastModifiedDate;
	}
	public Date getDate_closed() {
		return date_closed;
	}
	public void setDate_closed(Date date_closed) {
		this.date_closed = date_closed;
	}
	
	Set<Product_Team> product_team;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	public Set<Product_Team> getProduct_team() {
		return product_team;
	}
	public void setProduct_team(Set<Product_Team> product_team) {
		this.product_team = product_team;
	}
	
	Set<Contract> contract;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	public Set<Contract> getContract() {
		return contract;
	}
	public void setContract(Set<Contract> contract) {
		this.contract = contract;
	}
	
	Country country;
	
	@ManyToOne
	@JoinColumn(name = "Country_id")
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	Financing_Plan_Type financing_plan_type;

	@ManyToOne
	@JoinColumn(name = "Financing_Plan_Type_id")
	public Financing_Plan_Type getFinancing_plan_type() {
		return financing_plan_type;
	}
	public void setFinancing_plan_type(Financing_Plan_Type financing_plan_type) {
		this.financing_plan_type = financing_plan_type;
	}
	
	
	Fund_Source fund_source;

	@ManyToOne
	@JoinColumn(name = "Fund_Source_id")
	public Fund_Source getFund_source() {
		return fund_source;
	}
	public void setFund_source(Fund_Source fund_source) {
		this.fund_source = fund_source;
	}
	
	Product_Status product_status;

	@ManyToOne
	@JoinColumn(name = "Product_Status_id")
	public Product_Status getProduct_status() {
		return product_status;
	}
	public void setProduct_status(Product_Status product_status) {
		this.product_status = product_status;
	}
	
	Product_Type product_type;
	
	@ManyToOne
	@JoinColumn(name = "Product_Type_id")
	public Product_Type getProduct_type() {
		return product_type;
	}
	public void setProduct_type(Product_Type product_type) {
		this.product_type = product_type;
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
	
	Product_Subsector product_subsector;

	@ManyToOne
	@JoinColumn(name = "Product_Subsector_id")
	public Product_Subsector getProduct_subsector() {
		return product_subsector;
	}
	public void setProduct_subsector(Product_Subsector product_subsector) {
		this.product_subsector = product_subsector;
	}
	
	
}
