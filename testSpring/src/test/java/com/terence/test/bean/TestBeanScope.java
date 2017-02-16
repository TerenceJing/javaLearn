package com.terence.test.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.bean.BeanScope;
import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase{
	public TestBeanScope()
	{
		super("classpath*:spring-beanscope.xml");
	}
	@Test
	public void testSay()
	{
		BeanScope beanScope=super.getBean("beanScope");
		beanScope.sayHello(beanScope);
		
		BeanScope beanScope1=super.getBean("beanScope");
		beanScope.sayHello(beanScope1);
		System.out.println("上述两个对象是同一个测试方法下的，若希地址相同，则表示---单例模式");
	}
	@Test
	public void testSay2()
	{
		BeanScope beanScope=super.getBean("beanScope");
		beanScope.sayHello(beanScope);
		System.out.println("最后一个对象是testSay2（）方法中的，哈希地址不相同");
	}
	

}
