package com.MF_App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.MF_App.domain.User;
import com.MF_App.repositories.UserRepository;
import com.MF_App.security.CustomSecurityUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUsername(username);
		
		if (user == null)
			throw new UsernameNotFoundException("Invalid Username and password.");

		
		return new CustomSecurityUser(user);
	}

}
