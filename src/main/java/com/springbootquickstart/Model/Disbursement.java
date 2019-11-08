package com.springbootquickstart.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Disbursement")
public class Disbursement {
	//Long contract_id;
	//Long disbursement_number;
	Long id;
	Date date;
	String Description;
	Double Actual_Amount;
	Double Projected_Amount;
	Boolean LockRecord;
	String Remarks;
	String CreatedBy;
	Date CreatedDate;
	String LastModifiedBy;
	Date LastModifiedDate;
	Boolean QuarterProjFlag;
	
	@Id 
	@GeneratedValue( strategy=GenerationType.AUTO )
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Double getActual_Amount() {
		return Actual_Amount;
	}
	public void setActual_Amount(Double actual_Amount) {
		Actual_Amount = actual_Amount;
	}
	public Double getProjected_Amount() {
		return Projected_Amount;
	}
	public void setProjected_Amount(Double projected_Amount) {
		Projected_Amount = projected_Amount;
	}
	public Boolean getLockRecord() {
		return LockRecord;
	}
	public void setLockRecord(Boolean lockRecord) {
		LockRecord = lockRecord;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
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
	public Boolean getQuarterProjFlag() {
		return QuarterProjFlag;
	}
	public void setQuarterProjFlag(Boolean quarterProjFlag) {
		QuarterProjFlag = quarterProjFlag;
	}
	
	
	Contract contract;

	@ManyToOne
	@JoinColumn(name = "Contract_id")
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
}
