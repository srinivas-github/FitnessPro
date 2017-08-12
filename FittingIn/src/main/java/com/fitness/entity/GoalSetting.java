package main.java.com.fitness.entity;

import java.io.Serializable;

public class GoalSetting implements Serializable{

	private int userId;
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	private int steps;
	private int pushups;
	private int cycling;
	private int abs;
	private int squats;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
