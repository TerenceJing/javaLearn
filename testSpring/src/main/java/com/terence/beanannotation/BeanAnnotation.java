package com.terence.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")//作用域
@Component("beanAnnotation") //bean的注解声明
public class BeanAnnotation {
	public void say(String arg)
	{
		System.out.println("BeanAnnotation:"+arg);
	}
	public void myHashCode()
	{
		System.out.println("BeanAnnotation:"+this.hashCode());
	}

}
