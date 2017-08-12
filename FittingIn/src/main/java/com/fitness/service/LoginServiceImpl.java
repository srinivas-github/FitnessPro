package com.fitness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.dao.LoginDAO;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginDAO loginDAO;
	
	

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}



	@Override
	public boolean checkLogin(String username, String password) {
		
		return loginDAO.checkLogin(username, password);
	}

}
