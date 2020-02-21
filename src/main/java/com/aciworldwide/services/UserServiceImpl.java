package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;


//business layer interface impementor
@Service
public class UserServiceImpl implements UserService {

	//busness logic method implementation
	@Override
	public boolean isValid(User user) {
		// TODO Auto-generated method stub
		
		//business logic
		if(user!=null && user.getUsername().equals("root")&& user.getPassword().equals("root"))
		return true;
		
		return false;
	}

}
