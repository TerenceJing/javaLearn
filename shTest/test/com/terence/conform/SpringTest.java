package com.terence.conform;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	private static ApplicationContext context = null;
	
	/*
	 * 加载Spring的核心配置文件
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
		Date date =  (Date) context.getBean("date");
		System.out.println(date);
	}

}
