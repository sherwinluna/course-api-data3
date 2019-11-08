package com.springbootquickstart.Model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Role")
public class Role {
	Long id;
	String name;
	
	Set<Staff> users;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToMany(mappedBy = "roles")
    public Set<Staff> getUsers() {
        return users;
    }

    public void setUsers(Set<Staff> users) {
        this.users = users;
    }
}
