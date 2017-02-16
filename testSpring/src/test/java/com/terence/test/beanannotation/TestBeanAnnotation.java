package com.terence.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.beanannotation.BeanAnnotation;
import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {
	public TestBeanAnnotation()
	{
		super("classpath*:spring-beanannotation.xml");
	}
	@Test
	public void testSay()
	{
		BeanAnnotation bean=super.getBean("beanAnnotation");
		bean.say("This is terence's test demo.");
		
		bean=super.getBean("bean");
		bean.say("this is a test.");
	}
	
	@Test
	public void testScope() //测试作用域，两次获取对象的哈希地址一样
	{
		BeanAnnotation bean=super.getBean("beanAnnotation");
		bean.myHashCode();
		
		bean=super.getBean("beanAnnotation");
		bean.myHashCode();
	}

}
