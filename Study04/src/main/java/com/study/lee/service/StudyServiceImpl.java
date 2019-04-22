package com.study.lee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.lee.domain.Study;
import com.study.lee.mapper.StudyMapper;

@Service("com.study.lee.service.StudyServiceImpl")
public class StudyServiceImpl implements StudyService{

	@Autowired
	private StudyMapper studymapper;
	
	public List<Study> selectList(){
		
		return studymapper.selectlist();
	}
	
	
}
