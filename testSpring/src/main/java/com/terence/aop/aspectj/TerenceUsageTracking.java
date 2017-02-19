package com.terence.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class TerenceUsageTracking {
	/*@DeclareParents(value="com.terence.aop.aspectj.*+",defaultImpl=DefaultUsageTracked.class)
	public static UsageTracked mixin;
	@Before("com.terence.aop.aspectj.biz.businessService()&&this(usageTracked)")
	public void recordUsage(UsageTracked usageTracked)
	{
		usageTracked.incrementUseCount();
	}*/
}

