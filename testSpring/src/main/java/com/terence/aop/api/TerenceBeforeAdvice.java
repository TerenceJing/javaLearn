package com.terence.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class TerenceBeforeAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("TerenceBeforeAdvice:"+method.getName()+" "+
			target.getClass().getName());

	}

}
