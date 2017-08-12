package com.classes.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.classes.constants.FPConstants;
import com.classes.constants.JSPConstants;

/***
 * 
 * @author Fitness Pro
 *
 */

@Controller
@RequestMapping(value=FPConstants.REGISTRATION)

public class RegistrationController{

	@RequestMapping(value=FPConstants.REGISTRATION_HOME)
	public String openRegistrationPage(){
		return JSPConstants.REGISTRATION_HOME;
	}
	
	@RequestMapping(value=FPConstants.REGISTRATION_FORM)
	public String doRegistration(@PathParam(value = "password") String password){
		System.out.println(password);
		return null;
	}
}
