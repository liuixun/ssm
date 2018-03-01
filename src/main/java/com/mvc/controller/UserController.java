package com.mvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.domain.User;
import com.mvc.service.UserServiceImpl;

@Controller
@RequestMapping(value= "/user")
public class UserController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping("/view")
	public String view(){
		userService.findByUserName("");
		return "main/login";
	}
	
	@RequestMapping("indexview")
	public String index(){
		return "main/index";
	}
/*	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpSession session){
		System.out.println(12);
		logger.info("----------登录--------");
		logger.debug("----------登录--------");
		System.out.println(request.getParameter("userName"));
		User user = userService.findByUserName("123");
		if(user == null || !user.getPassWord().equals(request.getParameter("passWord"))){
			return new ModelAndView("redirect:/login.jsp");
		}else{
			System.out.println(user.getPassWord());
			session.setAttribute("user", user);
			ModelAndView mav = new ModelAndView();
			mav.addObject("user", user);
			mav.setViewName("index");
			return mav;
		}
		
	}*/
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("user") User model, HttpSession session){
		System.out.println(12);
		logger.info("----------登录--------");
		logger.debug("----------登录--------");
		User user = userService.findByUserName(model.getUserName());
		if(user == null || !user.getPassWord().equals(model.getPassWord())){
			return new ModelAndView("redirect:/login.jsp");
		}else{
			session.setAttribute("user", user);
			ModelAndView mav = new ModelAndView();
			mav.setViewName("index");
			return mav;
		}
		
	}
}
