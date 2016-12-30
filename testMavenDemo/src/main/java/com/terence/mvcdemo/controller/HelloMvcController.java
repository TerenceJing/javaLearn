package com.terence.mvcdemo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//用一个标签让spring知道这是一个controller 
//使用该注解的类会被dispatcher扫描注册并且使用该类了的方法同时检测
@Controller
//拦截根目录下的hello。
@RequestMapping("/hello") 
public class HelloMvcController {
	
	//返回URL
	@RequestMapping("/mvc")
	//这个Controller会响应这样一个请求：host:8080/hello/mvc
	public String helloMvc()
	{
		return "home";
	}
}