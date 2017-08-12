package com.classes.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.classes.constants.FPConstants;
import com.classes.constants.JSPConstants;
import com.classes.pojo.GoalSetting;
import com.classes.service.provider.GoalsServiceProvider;

@Controller
@RequestMapping(value=FPConstants.GOALS)
public class GoalsController implements ApplicationContextAware{

	ApplicationContext context;
	
	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	@RequestMapping(value=FPConstants.ADD_GOAL)
	public String viewGoalSettingPage(@PathParam(value="userID") String userID, ModelMap map){
		map.addAttribute(FPConstants.USER_ID, userID);
		return JSPConstants.ADD_GOAL;
	}
	
	@RequestMapping(value=FPConstants.SAVE_GOAL)
	public String saveGoal(@PathParam(value=FPConstants.NO_OF_STEPS) String steps,
						  @PathParam(value=FPConstants.PUSHUPS) String pushups,
						  @PathParam(value=FPConstants.ABS) String abs,
						  @PathParam(value=FPConstants.BRISKWALK) String briskWalk,
						  @PathParam(value=FPConstants.CYCLING) String cycling,
						  @PathParam(value=FPConstants.USER_ID) String userID){
		GoalsServiceProvider service = (GoalsServiceProvider)getContext().getBean(GoalsServiceProvider.class);
		
		GoalSetting goal = new GoalSetting(Integer.parseInt(steps), 
										  Integer.parseInt(pushups), 
										  Integer.parseInt(cycling), 
										  Integer.parseInt(abs), 
										  Integer.parseInt(briskWalk),
										  Integer.parseInt(userID));
		service.addGoal(goal);
		return JSPConstants.HOME;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
	
}
