package com.MF_App.domain;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.MF_App.security.Authority;

@Entity
@Table(name="users")

public class User 
{
	private Integer id;
	private String FName;
	private String LName;
	private String position;
	private String team;
	private String username;
	private String password;
	private Set<Authority> authorities = new HashSet<>();
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	public String getFName() 
	{
		return FName;
	}
	
	public void setFName(String fName) 
	{
		FName = fName;
	}
	
	public String getLName() 
	{
		return LName;
	}
	
	public void setLName(String lName) 
	{
		LName = lName;
	}
	
	public String getPosition() 
	{
		return position;
	}
	
	public void setPosition(String position) 
	{
		this.position = position;
	}
	
	public String getTeam() 
	{
		return team;
	}
	
	public void setTeam(String team) 
	{
		this.team = team;
	}
	
	public String getUsername() 
	{
		return username;
	}
	
	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="user")
	public Set<Authority> getAuthorities() 
	{
		return authorities;
	}

	public void setAuthorities(Set<Authority> authorities) 
	{
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", FName=" + FName + ", LName=" + LName + ", position=" + position + ", team=" + team
				+ ", username=" + username + ", password=" + password + ", authorities=" + authorities + "]";
	}
	

}
