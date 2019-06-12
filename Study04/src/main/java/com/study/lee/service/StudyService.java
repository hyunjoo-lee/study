package com.study.lee.service;

import javax.servlet.http.HttpSession;

public interface StudyService {


	public boolean loginCheck(String id, String password,HttpSession session);
	
	
	
}
