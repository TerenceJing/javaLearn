package com.terence.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class TerenceAfterReturningAdvice implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] arga,
			Object target) throws Throwable {
		System.out.println("TerenceAfterReturningAdvice:"+method.getName()+" "+
			target.getClass().getName()+" "+returnValue);
	}
}
