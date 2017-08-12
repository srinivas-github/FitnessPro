package com.classes.pojo;


public class GoalSetting {
	
	private int steps ;
	private int pushups ;
	private int cycling ;
	private int abs;
	private int squats ;
	private int userID;
	
	public GoalSetting(int steps,int pushups,int cycling,int abs,int squats,int userid) 
	{
		this.steps=steps ;
		this.pushups=pushups ;
		this.cycling=cycling;
		this.abs=abs;
		this.squats=squats ;
		this.userID = userid;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	public int getPushups() {
		return pushups;
	}

	public void setPushups(int pushups) {
		this.pushups = pushups;
	}

	public int getCycling() {
		return cycling;
	}

	public void setCycling(int cycling) {
		this.cycling = cycling;
	}

	public int getAbs() {
		return abs;
	}

	public void setAbs(int abs) {
		this.abs = abs;
	}

	public int getSquats() {
		return squats;
	}

	public void setSquats(int squats) {
		this.squats = squats;
	}

	
	
	
}

