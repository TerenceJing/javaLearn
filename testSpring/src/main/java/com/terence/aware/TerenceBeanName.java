package com.terence.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TerenceBeanName implements BeanNameAware,ApplicationContextAware{

	private String beanName;
	
	public void setBeanName(String name) {
		this.beanName=name;
		System.out.println("BeanName:"+name);
	}

	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		System.out.println("applicationContext:"+arg0.getBean(this.beanName));
		//从运行的结果看以，对象的哈希值一样，通过getBean得到的实例或者通过接口实现的对象是同一个对象
		
	}
	

}
