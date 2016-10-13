package com.experiment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.experiment.domain.Teacher;
import com.experiment.service.TestService;

@Controller
public class TestController {
	@Autowired
	TestService testService;
	
	@RequestMapping("/test")
	public ModelAndView test1(){
		ModelAndView mv = new ModelAndView("/test");
		Teacher teacher = testService.test1(1);
		System.out.println("名字："+teacher.getName());
		return mv;
	}
	
	@RequestMapping("/test2")
	@ResponseBody
	public Teacher test12(){
		return testService.test1(1);
	}
}
