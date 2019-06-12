package com.study.lee.domain;

import java.util.Date;

public class Study {
	
	
	private String id;
	private String password;
	private String userName;
	private Date userJoinDate;
	private Date userLoginDate;
	private String userSignature;
	private int userPoint;
	private boolean useCookie;
	
	
	
	
	
	
	public Date getUserJoinDate() {
		return userJoinDate;
	}

	public void setUserJoinDate(Date userJoinDate) {
		this.userJoinDate = userJoinDate;
	}

	public Date getUserLoginDate() {
		return userLoginDate;
	}

	public void setUserLoginDate(Date userLoginDate) {
		this.userLoginDate = userLoginDate;
	}

	public String getUserSignature() {
		return userSignature;
	}

	public void setUserSignature(String userSignature) {
		this.userSignature = userSignature;
	}

	public boolean isUseCookie() {
		return useCookie;
	}
	
	public void setUseCookie(boolean useCookie) {
		this.useCookie = useCookie;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserPoint() {
		return userPoint;
	}
	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	
	

	@Override
	public String toString() {
		return "Study [id=" + id + ", password=" + password + ", userName=" + userName + ", userJoinDate="
				+ userJoinDate + ", userLoginDate=" + userLoginDate + ", userSignature=" + userSignature
				+ ", userPoint=" + userPoint + ", useCookie=" + useCookie + "]";
	}
	

	
	
}
