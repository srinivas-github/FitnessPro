package com.fitness.service;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Map;


public class User implements Serializable,Comparator<User>{

	private int userId;
	private String userName;
	private GoalSetting Activity;
	private int rank;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public GoalSetting getActivity() {
		return Activity;
	}
	public void setActivity(GoalSetting activity) {
		Activity = activity;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public int compare(User o1, User o2) {
		return o1.getRank() - o2.getRank();
	}
	
	
	
}
