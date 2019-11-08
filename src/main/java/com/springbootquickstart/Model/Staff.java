package com.springbootquickstart.Model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Staff")
public class Staff {
	Long id;
	String username;
	String surname;
	String firstname;
	String dept;
	String division;
	String position;
	String email;
	String phone_local;
	String phone_direct;
	String room;
	String reportsto_staff_id;
	String password;
	String password_confirm;
	byte[] staff_image;
	
	Set<Role> roles;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Transient
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword_confirm() {
		return password_confirm;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_local() {
		return phone_local;
	}
	public void setPhone_local(String phone_local) {
		this.phone_local = phone_local;
	}
	public String getPhone_direct() {
		return phone_direct;
	}
	public void setPhone_direct(String phone_direct) {
		this.phone_direct = phone_direct;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getReportsto_staff_id() {
		return reportsto_staff_id;
	}
	public void setReportsto_staff_id(String reportsto_staff_id) {
		this.reportsto_staff_id = reportsto_staff_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword_confirm(String password_confirm) {
		this.password_confirm = password_confirm;
	}
	public byte[] getStaff_image() {
		return staff_image;
	}
	public void setStaff_image(byte[] staff_image) {
		this.staff_image = staff_image;
	}
	
	@ManyToMany
    @JoinTable(name = "Staff_Role", joinColumns = @JoinColumn(name = "Staff_id"), inverseJoinColumns = @JoinColumn(name = "Role_id"))
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    
    Set<Product_Team> product_team;

	@OneToMany(mappedBy = "staff", cascade = CascadeType.ALL)
	public Set<Product_Team> getProduct_team() {
		return product_team;
	}

	public void setProduct_team(Set<Product_Team> product_team) {
		this.product_team = product_team;
	}
}
