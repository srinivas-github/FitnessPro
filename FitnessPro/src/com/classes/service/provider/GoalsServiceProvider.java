package com.classes.service.provider;

import org.springframework.stereotype.Service;

import com.classes.dao.provider.GoalsDAOProvider;
import com.classes.pojo.GoalSetting;

@Service
public class GoalsServiceProvider {

	
	public boolean addGoal(GoalSetting goal){
		return new GoalsDAOProvider().addGoal(goal);
	}
}
