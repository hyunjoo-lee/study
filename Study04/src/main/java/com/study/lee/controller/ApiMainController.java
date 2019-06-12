package com.study.lee.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.lee.service.StudyService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ApiMainController {
	
	private static final Logger logger = LoggerFactory.getLogger(ApiMainController.class.getName());
	
	@Autowired
	private StudyService studyservice;
	
	@RequestMapping(value = "/itx", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "YO";
	}

	//로그인 화면
	@RequestMapping(value="/itx/login.do")
	public String loginMain() {
		return "/study/login";
	}
	
	//로그인 절차
	@RequestMapping(value="/itx/loginCheck.do" , method=RequestMethod.POST)
	public ModelAndView loginCheck(@RequestParam(name="id") String id
								  ,@RequestParam(name="password") String password
								  ,HttpSession session) {
		boolean result = studyservice.loginCheck(id,password,session);
		ModelAndView mav = new ModelAndView();
		if(result == true) {
			mav.setViewName("/YO");
			mav.addObject("msg", "success");
		}else {
			mav.setViewName("/study/login");
			mav.addObject("msg", "false");
		}
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
