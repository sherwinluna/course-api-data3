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
@Table(name = "Contract")
public class Contract {
	//String product_number;
	Long id;
	//Long contract_id;
	String contract_number;
	String ContractDesc;
	String contractor_name;
	Double contract_amount;
	String contract_type;
	Date award_date;
	Date completion_date;
	Double disbursed_amount;
	Double undisbursed_balance;
	Double DPrior_Years_Actual;
	Double DPrev_Actual;
	Double DPrev_Actual_Cummulative;
	Double DQ1_Actual;
	Double DQ2_Actual;
	Double DQ3_Actual;
	Double DQ4_Actual;
	Double CAPrior_Years_Actual;
	Double CAPrev_Actual;
	Double CAPrev_Actual_Cummulative;
	Double CAQ1_Actual;
	Double CAQ2_Actual;
	Double CAQ3_Actual;
	Double CAQ4_Actual;
	Date as_of_date;
	Boolean LockRecord;
	Date contract_date;
	String Remarks;
	Double disbursed_amount_computed;
	Double undisbursed_balance_computed;
	//Long product_id;
	String CreatedBy;
	Date CreatedDate;
	String LastModifiedBy;
	Date LastModifiedDate;
	Double contract_amount_original;
	Double disbursed_amount_original;
	Double undisbursed_balance_original;
	
	@Id 
	@GeneratedValue( strategy=GenerationType.AUTO )
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContract_number() {
		return contract_number;
	}
	public void setContract_number(String contract_number) {
		this.contract_number = contract_number;
	}
	public String getContractDesc() {
		return ContractDesc;
	}
	public void setContractDesc(String contractDesc) {
		ContractDesc = contractDesc;
	}
	public String getContractor_name() {
		return contractor_name;
	}
	public void setContractor_name(String contractor_name) {
		this.contractor_name = contractor_name;
	}
	public Double getContract_amount() {
		return contract_amount;
	}
	public void setContract_amount(Double contract_amount) {
		this.contract_amount = contract_amount;
	}
	public String getContract_type() {
		return contract_type;
	}
	public void setContract_type(String contract_type) {
		this.contract_type = contract_type;
	}
	public Date getAward_date() {
		return award_date;
	}
	public void setAward_date(Date award_date) {
		this.award_date = award_date;
	}
	public Date getCompletion_date() {
		return completion_date;
	}
	public void setCompletion_date(Date completion_date) {
		this.completion_date = completion_date;
	}
	public Double getDisbursed_amount() {
		return disbursed_amount;
	}
	public void setDisbursed_amount(Double disbursed_amount) {
		this.disbursed_amount = disbursed_amount;
	}
	public Double getUndisbursed_balance() {
		return undisbursed_balance;
	}
	public void setUndisbursed_balance(Double undisbursed_balance) {
		this.undisbursed_balance = undisbursed_balance;
	}
	public Double getDPrior_Years_Actual() {
		return DPrior_Years_Actual;
	}
	public void setDPrior_Years_Actual(Double dPrior_Years_Actual) {
		DPrior_Years_Actual = dPrior_Years_Actual;
	}
	public Double getDPrev_Actual() {
		return DPrev_Actual;
	}
	public void setDPrev_Actual(Double dPrev_Actual) {
		DPrev_Actual = dPrev_Actual;
	}
	public Double getDPrev_Actual_Cummulative() {
		return DPrev_Actual_Cummulative;
	}
	public void setDPrev_Actual_Cummulative(Double dPrev_Actual_Cummulative) {
		DPrev_Actual_Cummulative = dPrev_Actual_Cummulative;
	}
	public Double getDQ1_Actual() {
		return DQ1_Actual;
	}
	public void setDQ1_Actual(Double dQ1_Actual) {
		DQ1_Actual = dQ1_Actual;
	}
	public Double getDQ2_Actual() {
		return DQ2_Actual;
	}
	public void setDQ2_Actual(Double dQ2_Actual) {
		DQ2_Actual = dQ2_Actual;
	}
	public Double getDQ3_Actual() {
		return DQ3_Actual;
	}
	public void setDQ3_Actual(Double dQ3_Actual) {
		DQ3_Actual = dQ3_Actual;
	}
	public Double getDQ4_Actual() {
		return DQ4_Actual;
	}
	public void setDQ4_Actual(Double dQ4_Actual) {
		DQ4_Actual = dQ4_Actual;
	}
	public Double getCAPrior_Years_Actual() {
		return CAPrior_Years_Actual;
	}
	public void setCAPrior_Years_Actual(Double cAPrior_Years_Actual) {
		CAPrior_Years_Actual = cAPrior_Years_Actual;
	}
	public Double getCAPrev_Actual() {
		return CAPrev_Actual;
	}
	public void setCAPrev_Actual(Double cAPrev_Actual) {
		CAPrev_Actual = cAPrev_Actual;
	}
	public Double getCAPrev_Actual_Cummulative() {
		return CAPrev_Actual_Cummulative;
	}
	public void setCAPrev_Actual_Cummulative(Double cAPrev_Actual_Cummulative) {
		CAPrev_Actual_Cummulative = cAPrev_Actual_Cummulative;
	}
	public Double getCAQ1_Actual() {
		return CAQ1_Actual;
	}
	public void setCAQ1_Actual(Double cAQ1_Actual) {
		CAQ1_Actual = cAQ1_Actual;
	}
	public Double getCAQ2_Actual() {
		return CAQ2_Actual;
	}
	public void setCAQ2_Actual(Double cAQ2_Actual) {
		CAQ2_Actual = cAQ2_Actual;
	}
	public Double getCAQ3_Actual() {
		return CAQ3_Actual;
	}
	public void setCAQ3_Actual(Double cAQ3_Actual) {
		CAQ3_Actual = cAQ3_Actual;
	}
	public Double getCAQ4_Actual() {
		return CAQ4_Actual;
	}
	public void setCAQ4_Actual(Double cAQ4_Actual) {
		CAQ4_Actual = cAQ4_Actual;
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
	public Date getContract_date() {
		return contract_date;
	}
	public void setContract_date(Date contract_date) {
		this.contract_date = contract_date;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	public Double getDisbursed_amount_computed() {
		return disbursed_amount_computed;
	}
	public void setDisbursed_amount_computed(Double disbursed_amount_computed) {
		this.disbursed_amount_computed = disbursed_amount_computed;
	}
	public Double getUndisbursed_balance_computed() {
		return undisbursed_balance_computed;
	}
	public void setUndisbursed_balance_computed(Double undisbursed_balance_computed) {
		this.undisbursed_balance_computed = undisbursed_balance_computed;
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
	public Double getContract_amount_original() {
		return contract_amount_original;
	}
	public void setContract_amount_original(Double contract_amount_original) {
		this.contract_amount_original = contract_amount_original;
	}
	public Double getDisbursed_amount_original() {
		return disbursed_amount_original;
	}
	public void setDisbursed_amount_original(Double disbursed_amount_original) {
		this.disbursed_amount_original = disbursed_amount_original;
	}
	public Double getUndisbursed_balance_original() {
		return undisbursed_balance_original;
	}
	public void setUndisbursed_balance_original(Double undisbursed_balance_original) {
		this.undisbursed_balance_original = undisbursed_balance_original;
	}
	
	Set<Disbursement> disbursement;

	@OneToMany(mappedBy = "contract", cascade = CascadeType.ALL)
	public Set<Disbursement> getDisbursement() {
		return disbursement;
	}
	public void setDisbursement(Set<Disbursement> disbursement) {
		this.disbursement = disbursement;
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
}
