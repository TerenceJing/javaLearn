package com.terence.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TerenceApplicationContext implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext=applicationContext;
		System.out.println("TAContext:"+applicationContext.getBean("terenceApplicationContext"));
	}
	public void a()
	{
		System.out.println(applicationContext.hashCode());
	}
	
}
