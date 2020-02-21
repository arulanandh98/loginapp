package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;


//business layer interface-model interface


public interface UserService {

	//Business logic methods specifications
	boolean isValid(User user);
	
}
