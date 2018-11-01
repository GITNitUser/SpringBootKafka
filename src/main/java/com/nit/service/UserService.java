package com.nit.service;

import com.nit.model.User;

public interface UserService {
    
	public User getUser(int userId) ;
	public String saveUser(User user);
}
