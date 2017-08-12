package com.fitness.dao;

import java.util.List;

import main.java.com.fitness.entity.User;

public interface LoginDAO {

	public boolean checkLogin(String username,String password);
	
	public List<User> getUserActivities();
	
}
