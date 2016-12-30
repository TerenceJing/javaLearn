package com.terence.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TestController {
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	@RequestMapping("/viewAll")
	public ModelAndView viewAll(String name,String pwd)
	{
		ModelAndView mv=new ModelAndView();
		System.out.println("进入了控制器的viewAll（）方法……");
		System.out.println("name="+name);
		System.out.println("pwd="+pwd);
		mv.setViewName("hello1");
		mv.addObject("msg", "这是从Controller下的viewAll方法返回的一个消息");
		return mv;
	}
}
