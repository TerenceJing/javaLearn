package com.terence.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TerenceMethodInterceptor implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("TerenceMethodInterceptor 1:"+invocation.getMethod().getName()+" " +
												invocation.getStaticPart().getClass().getName()	);
		Object obj=invocation.proceed();
		System.out.println("TerenceMethodInterceptor 2:"+obj);
		return obj;
	}

}
