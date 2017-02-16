package com.terence.test.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.terence.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {
	
	public TestAware()
	{
		super("classpath*:spring-aware.xml");
	}
	@Test
	public void testTerenceApplicationContext()
	{
		System.out.println("tAC Bean的定义："+super.getBean("terenceApplicationContext"));
		
	}
	/*@Test
	public void testTerenceBeanName()
	{
		System.out.println("testTerenceBeanName Bean的定义："+super.getBean("terenceBeanName"));
	}*/

}
