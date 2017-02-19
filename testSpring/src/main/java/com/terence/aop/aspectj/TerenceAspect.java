package com.terence.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.terence.aop.aspectj.biz.TerenceMethod;

/*
 * «–√Ê¿‡
 */
@Component
@Aspect
public class TerenceAspect {
	@Pointcut("execution(* com.terence.aop.aspectj.biz.*Biz.**(..))")
	public void pointcut(){}
	
	@Pointcut("within(com.terence.aop.aspectj.biz.*)")
	public void bizPointcut(){}
	
	//@Before("executuion(* com.terence.aop.aspectj.biz.*Biz.*(..))")
	@Before("pointcut()")
	public void before()
	{
		System.out.println("Before");
	}
	
	@AfterReturning(pointcut="bizPointcut()",returning="returnValue")
	public void afterReturning(Object returnValue)
	{
		System.out.println("AfterReturning:"+returnValue);
	}
	
	@AfterThrowing(pointcut="pointcut()",throwing="e")
	public void afterThrowing(RuntimeException e)
	{
		System.out.println("AfterThrowing:"+e.getMessage());
		System.out.println("AfterThrowing:"+e);
	}
	@After("pointcut()")
	public void after()
	{
		System.out.println("After");
	}
	@Around("pointcut()") 
	public Object around(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("Around 1");
		Object obj=pjp.proceed();
		System.out.println("Around 2");
		return obj;
	}
	
	@Before("pointcut()&&args(arg)")
	public void beforeWithParam(String arg)
	{
		System.out.println("Before Param:"+arg);
	}
	@Before("pointcut()&&@annotation(terenceMethod)")
	public void beforeWithAnnotation(TerenceMethod terenceMethod)
	{
		System.out.println("beforeWithAnnotation:"+terenceMethod.value());
	}
	
	
	
}


