package com.MF_App.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.MF_App.domain.User;

public class CustomSecurityUser extends User implements UserDetails {

	private static final long serialVersionUID = -3569033336800304898L;
	
	public CustomSecurityUser() {}
	
	public CustomSecurityUser(User user) {
		this.setAuthorities(user.getAuthorities());
		this.setId(user.getId());
		this.setFName(user.getFName());
		this.setLName(user.getLName());
		this.setPosition(user.getPosition());
		this.setTeam(user.getTeam());
		this.setUsername(user.getUsername());
		this.setPassword(user.getPassword());
		
	}


	@Override
	public Set<Authority> getAuthorities() {
		return super.getAuthorities();
	}
	

	@Override
	public String getPassword() {
		
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		
		return super.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

}
