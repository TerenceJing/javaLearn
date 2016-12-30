package com.terence.mvcdemo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public  class Test2Interceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2,
			Exception arg3) throws Exception {
		System.out.println("执行到了afterCompletion2（）");
		
	}

	public void postHandle(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2,
			ModelAndView arg3) throws Exception {
		System.out.println("执行到了postHandle2（）");	
	}

	public boolean preHandle(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2)
			throws Exception {
		System.out.println("执行到了preHandle2（）");
		return true;
	}

}
