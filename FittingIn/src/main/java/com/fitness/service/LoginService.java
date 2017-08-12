package com.fitness.service;

import java.util.List;

import main.java.com.fitness.entity.User;

public interface LoginService {
	
	public boolean checkLogin(String username,String password);
	
	public List<User> getUserAcivities();

}
