package com.fitness.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fitness.service.LoginService;

@Controller
@RequestMapping("/signup")
public class SignUpController {

	
	@Autowired
	public LoginService loginService;

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Map model) {
		LoginForm loginForm = new LoginForm();
		model.put("loginform", loginForm);
		return "loginform";
	}

	@RequestMapping(value="processLogin",method = RequestMethod.GET)
	public String processForm(@RequestParam(value="uname") String username,@RequestParam(value="pwd") String password, BindingResult result,
			Map model) {

		System.out.println("username : "+username);
		System.out.println("password : "+password);
		if (result.hasErrors()) {
			return "loginform";
		}
		
		
		boolean userExists = loginService.checkLogin(username,
                password);
		if(userExists){
			return "loginsuccess";
		}else{
			result.rejectValue("uname","invaliduser");
			return "loginFailure";
		}

	}
}
