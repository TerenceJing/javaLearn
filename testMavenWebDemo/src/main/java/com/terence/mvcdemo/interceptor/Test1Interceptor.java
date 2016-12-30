package com.terence.mvcdemo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public  class Test1Interceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2,
			Exception arg3) throws Exception {
		System.out.println("执行到了afterCompletion1（）");
		
	}

	public void postHandle(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2,
			ModelAndView arg3) throws Exception {
		arg3.addObject("msg","这是拦截器postHandle方法修改之后的消息");//更改传回的参数值。
		arg3.setViewName("hello2");//更改请求页面，类似于重定向
		System.out.println("执行到了postHandle1（）");	
	}

	public boolean preHandle(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2)
			throws Exception {
		arg0.setCharacterEncoding("utf-8");
		
		System.out.println("执行到了preHandle1（）");
		//如果用户没有登录，则终止请求,并返回到登录页面
//		if(arg0.getSession().getAttribute("user")==null)
//		{
//			arg0.getRequestDispatcher("/login").forward(arg0, arg1);
//				//return false;
//		}
		return true;
	}
}
