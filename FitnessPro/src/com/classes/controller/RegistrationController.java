package com.classes.controller;

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
}
