package com.study.lee.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.study.lee.domain.Study;
import com.study.lee.service.StudyService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class.getName());
	
	@Resource(name="com.study.lee.service.StudyServiceImpl")
	//@Autowired
	private StudyService studyservice;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		List<Study> aa = studyservice.selectList();
			
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("aa", aa );		
		
		return "YO";
	}
	
	
	
	@RequestMapping(value="/itx/login.do")
	public ModelAndView loginMain() {
		//HttpServletRequest req
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/study/login");
		
		return mav;
		
	}
	
}
