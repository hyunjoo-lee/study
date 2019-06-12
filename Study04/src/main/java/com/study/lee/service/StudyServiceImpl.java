package com.study.lee.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.lee.domain.Study;
import com.study.lee.mapper.StudyMapper;

@Service
public class StudyServiceImpl implements StudyService{

	@Autowired
	private StudyMapper studymapper;
	
	private final SqlSession sqlSession;
	
	@Autowired
	public StudyServiceImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	
	
	@Override
	public boolean loginCheck(String id, String password,HttpSession session) {
		
		
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		params.put("password", password);
		
		List<Study> list = studymapper.loginCheck(params);
		
		if(list.size() > 0) {
			
			session.setAttribute("id", id);
			session.setAttribute("password", password);
			
			
			return true;
		}
		
		return false;
	}
	
	
}
