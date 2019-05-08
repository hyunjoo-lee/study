package com.study.lee.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.study.lee.service.StudyService;
import com.study.lee.service.StudyServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class.getName());
	
	@Autowired
	private StudyServiceImpl studyservice;
	
	@RequestMapping(value = "/itx", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "YO";
	}
	
	//로그인 화면
	@RequestMapping(value="/itx/login.do")
	public ModelAndView loginMain() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/study/login");
		return mav;
	}
	
	//회원가입화면
	@RequestMapping(value="/itx/signUp.do")
	public ModelAndView signUp() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/study/signUp");
		return mav;
	}
	
	//아이디-비번 찾는 화면
	@RequestMapping(value="/itx/findInfo.do")
	public ModelAndView findInfo() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/study/findInfo");
		return mav;
	}
	
}
